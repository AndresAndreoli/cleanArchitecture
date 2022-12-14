package com.example.core.interactors

import com.example.core.data.BookmarkRepository
import com.example.core.domain.Bookmark
import com.example.core.domain.Document

class RemoveBookmark(private val bookmarksRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarksRepository
        .removeBookmark(document, bookmark)
}