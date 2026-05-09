package com.impart.vibecollector.di

import android.content.Context
import android.content.ClipboardManager
import androidx.room.Room
import com.impart.vibecollector.data.ClipMemoryDao
import com.impart.vibecollector.data.ImpartDatabase
import com.impart.vibecollector.network.AiAnalysisApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): ImpartDatabase =
        Room.databaseBuilder(context, ImpartDatabase::class.java, "impart.db").build()

    @Provides
    fun provideClipMemoryDao(database: ImpartDatabase): ClipMemoryDao = database.clipMemoryDao()

    @Provides
    fun provideClipboardManager(@ApplicationContext context: Context): ClipboardManager =
        context.getSystemService(ClipboardManager::class.java)

    @Provides
    @Singleton
    fun provideAiAnalysisApi(): AiAnalysisApi {
        val json = Json { ignoreUnknownKeys = true }
        return Retrofit.Builder()
            .baseUrl("https://api.deepseek.com/")
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()
            .create(AiAnalysisApi::class.java)
    }
}
