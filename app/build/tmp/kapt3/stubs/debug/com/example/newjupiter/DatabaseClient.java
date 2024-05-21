package com.example.newjupiter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/example/newjupiter/DatabaseClient;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appDatabase", "Lcom/example/newjupiter/AppDatabase;", "getAppDatabase", "()Lcom/example/newjupiter/AppDatabase;", "Companion", "app_debug"})
public final class DatabaseClient {
    @org.jetbrains.annotations.NotNull
    private final com.example.newjupiter.AppDatabase appDatabase = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.newjupiter.DatabaseClient.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.example.newjupiter.DatabaseClient instance;
    
    private DatabaseClient(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.newjupiter.AppDatabase getAppDatabase() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/newjupiter/DatabaseClient$Companion;", "", "()V", "instance", "Lcom/example/newjupiter/DatabaseClient;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.newjupiter.DatabaseClient getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}