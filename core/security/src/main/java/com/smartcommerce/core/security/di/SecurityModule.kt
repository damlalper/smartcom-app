package com.smartcommerce.core.security.di

import com.smartcommerce.core.security.TokenManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SecurityModule {

    // TokenManager is already annotated with @Inject and @Singleton, 
    // but if we needed to provide it explicitly or other security configs, 
    // this module is the place. 
    // Leaving it here as a placeholder for future security configs.
}
