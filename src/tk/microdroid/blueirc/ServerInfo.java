package tk.microdroid.blueirc;

import java.io.Serializable;

/**
 * Contains connection info about the IRC server.
 * Either passed to the constructor of {@code Worker} or the other constructor creates it.
 * Either way, each Worker has an instance of this class 
 * 
 * @see Worker#Worker(ServerInfo)
 * 
 */
public class ServerInfo implements Serializable {
	private static final long serialVersionUID = -6804167618737848286L;
	public String server="", nick="", secondNick="", currentNick="", username="", nickservPass="", serverPass="",
			saslUsername="", saslPassword="";
    public int port=6667;
    public boolean ssl=false, invalidSSL=false;
}
