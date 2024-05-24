package com.example.newjupiter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J5\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/newjupiter/SheetsServiceHelper;", "", "credential", "Lcom/google/api/client/googleapis/extensions/android/gms/auth/GoogleAccountCredential;", "(Lcom/google/api/client/googleapis/extensions/android/gms/auth/GoogleAccountCredential;)V", "TAG", "", "service", "Lcom/google/api/services/sheets/v4/Sheets;", "getService", "()Lcom/google/api/services/sheets/v4/Sheets;", "service$delegate", "Lkotlin/Lazy;", "readSheet", "", "spreadsheetId", "range", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeSheet", "", "values", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SheetsServiceHelper {
    private final com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential credential = null;
    private final java.lang.String TAG = "SheetsServiceHelper";
    private final kotlin.Lazy service$delegate = null;
    
    public SheetsServiceHelper(@org.jetbrains.annotations.NotNull
    com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential credential) {
        super();
    }
    
    private final com.google.api.services.sheets.v4.Sheets getService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object readSheet(@org.jetbrains.annotations.NotNull
    java.lang.String spreadsheetId, @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<? extends java.lang.Object>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object writeSheet(@org.jetbrains.annotations.NotNull
    java.lang.String spreadsheetId, @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.List<? extends java.lang.Object>> values, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}