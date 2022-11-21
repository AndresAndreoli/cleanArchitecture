package com.raywenderlich.android.majesticreader.framework

import android.content.Context
import com.example.core.data.BookmarkDataSource
import com.example.core.domain.Bookmark
import com.example.core.domain.Document
import com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity
import com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase

class RoomBookmarkDataSource(context: Context) : BookmarkDataSource {

    private val bookmarkDao = MajesticReaderDatabase.getInstance(context).bookmarkDao()

    override suspend fun add(document: Document, bookmark: Bookmark) =
        bookmarkDao.addBookmark(
            BookmarkEntity(
            documentUri = document.url,
            page = bookmark.page
        )
        )

    override suspend fun read(document: Document): List<Bookmark> = bookmarkDao
        .getBookmarks(document.url).map { Bookmark(it.id, it.page) }

    override suspend fun remove(document: Document, bookmark: Bookmark) =
        bookmarkDao.removeBookmark(
            BookmarkEntity(id = bookmark.id, documentUri = document.url, page = bookmark.page)
        )
}