package org.javaboy.plugin.action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;

public class AlterAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        NotificationGroup notificationGroup = new NotificationGroup("alter_id", NotificationDisplayType.BALLOON, false);
        Notification notification = notificationGroup.createNotification("测试通知", MessageType.INFO);
        Notifications.Bus.notify(notification);
    }
}
