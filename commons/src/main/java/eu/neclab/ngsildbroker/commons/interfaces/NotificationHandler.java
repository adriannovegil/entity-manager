package eu.neclab.ngsildbroker.commons.interfaces;

import eu.neclab.ngsildbroker.commons.datatypes.Notification;
import eu.neclab.ngsildbroker.commons.datatypes.requests.SubscriptionRequest;

public interface NotificationHandler {

    /**
     *
     * @param notification
     * @param ldContext
     */
    void notify(Notification notification, SubscriptionRequest subscriptionRequest);

}
