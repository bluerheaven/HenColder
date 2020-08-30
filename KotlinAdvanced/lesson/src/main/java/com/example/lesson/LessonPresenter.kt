package com.example.lesson

import com.example.core.http.EntityCallback
import com.example.core.http.HttpClient.get
import com.example.core.utils.Utils.toast
import com.example.lesson.entity.Lesson
import com.google.gson.reflect.TypeToken

class LessonPresenter(private val activity: LessonActivity) {
    companion object {
        private const val LESSON_PATH = "lessons"
    }

    private var lessons = listOf<Lesson>()

    private val type = object : TypeToken<List<Lesson>>() {}.type

    fun fetchData() {
        get(LESSON_PATH, type, object : EntityCallback<List<Lesson>> {
            override fun onSuccess(entity: List<Lesson>) {
                this@LessonPresenter.lessons = entity
                activity.runOnUiThread {
                    activity.showResult(entity)
                }
            }

            override fun onFailure(message: String) {
                activity.runOnUiThread {
                    toast(message)
                }
            }
        })
    }

    fun showPlayback() {
        activity.showResult(lessons.filter {
            it.state === Lesson.State.PLAYBACK
        })
    }

}