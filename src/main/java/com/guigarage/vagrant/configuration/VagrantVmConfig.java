package com.guigarage.vagrant.configuration;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class VagrantVmConfig {

	private List<VagrantPortForwarding> portForwardings;
	
	private PuppetProvisionerConfig puppetProvisionerConfig;
	
	private String name;
	
	private String ip;

	private String boxName;
	
	private URL boxUrl;

	public VagrantVmConfig(String name, String ip, String boxName, URL boxUrl, Iterable<VagrantPortForwarding> portForwardings, PuppetProvisionerConfig puppetProvisionerConfig) {
		this.portForwardings = new ArrayList<>();
		if(portForwardings != null) {
			for(VagrantPortForwarding portForwarding : portForwardings) {
				this.portForwardings.add(portForwarding);
			}
		}
		this.puppetProvisionerConfig = puppetProvisionerConfig;
		this.ip = ip;
		this.name = name;
		this.boxName = boxName;
		this.boxUrl = boxUrl;
	}
	
	public String getBoxName() {
		return boxName;
	}
	
	public URL getBoxUrl() {
		return boxUrl;
	}
	
	public PuppetProvisionerConfig getPuppetProvisionerConfig() {
		return puppetProvisionerConfig;
	}
	
	public Iterable<VagrantPortForwarding> getPortForwardings() {
		return portForwardings;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIp() {
		return ip;
	}
	
}
