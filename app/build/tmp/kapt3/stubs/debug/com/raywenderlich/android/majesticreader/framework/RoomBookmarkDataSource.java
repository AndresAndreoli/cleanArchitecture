package com.raywenderlich.android.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/RoomBookmarkDataSource;", "Lcom/example/core/data/BookmarkDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bookmarkDao", "Lcom/raywenderlich/android/majesticreader/framework/db/BookmarkDao;", "add", "", "document", "Lcom/example/core/domain/Document;", "bookmark", "Lcom/example/core/domain/Bookmark;", "(Lcom/example/core/domain/Document;Lcom/example/core/domain/Bookmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "", "(Lcom/example/core/domain/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "app_debug"})
public final class RoomBookmarkDataSource implements com.example.core.data.BookmarkDataSource {
    private final com.raywenderlich.android.majesticreader.framework.db.BookmarkDao bookmarkDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object add(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.Document document, @org.jetbrains.annotations.NotNull()
    com.example.core.domain.Bookmark bookmark, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object read(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.Document document, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.core.domain.Bookmark>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object remove(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.Document document, @org.jetbrains.annotations.NotNull()
    com.example.core.domain.Bookmark bookmark, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    public RoomBookmarkDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}