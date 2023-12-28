package com.github.sonyaburg.helloworldplugin.actions
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages


class MyAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val currentProject: Project? = event.project
        val msg = "Hello world!"
        Messages.showMessageDialog(
            currentProject,
            msg,
            "My Action Invoked",
            Messages.getWarningIcon()
        )
    }

    override fun update(e: AnActionEvent) {
        e.presentation.isEnabledAndVisible = e.project != null
    }

    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.BGT
    }
}