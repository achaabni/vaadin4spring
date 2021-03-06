/*
 * Copyright 2014 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.samples.sidebar;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Notification;
import org.springframework.stereotype.Component;
import org.vaadin.spring.UIScope;
import org.vaadin.spring.stuff.sidebar.FontAwesomeIcon;
import org.vaadin.spring.stuff.sidebar.SideBarItem;

import java.io.Serializable;

/**
 * Example operation that shows up under the Planning section in the side bar.
 *
 * @author Petter Holmström (petter@vaadin.com)
 */
@SideBarItem(sectionId = Sections.PLANNING,
        caption = "Operation",
        order = 3)
@FontAwesomeIcon(FontAwesome.APPLE)
@Component
@UIScope
public class PlanningOperation implements Runnable, Serializable {
    @Override
    public void run() {
        Notification.show("Operation executed!");
    }
}
