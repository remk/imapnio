/**
 *
 */
package com.lafaspot.imapnio.listener;

import java.util.List;

import com.lafaspot.imapnio.client.IMAPSession;
import com.sun.mail.imap.protocol.IMAPResponse;

/**
 * Listener for command responses form IMAP server. All tagged responses will go to onResponse and un-tagged responses will go to onMessage.
 *
 * @author kraman
 *
 */
public interface IMAPCommandListener {

    /**
     * Will be called when there is a tagged response from the remote server.
     *
     * @param session IMAPSession
     * @param tag IMAP tag being used
     * @param responses IMAPResponse
     */
    void onResponse(final IMAPSession session, final String tag, final List<IMAPResponse> responses);

    /**
     * Will be called when an untagged message is received from remote server.
     *
     * @param session IMAPSession
     * @param response IMAPResponse
     */
    void onMessage(final IMAPSession session, final IMAPResponse response);
}
