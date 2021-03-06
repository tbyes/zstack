package org.zstack.header.zone;

import org.zstack.header.message.APIEvent;


/**
 * @apiResult
 *
 * api event for message :ref:`APIChangeZoneStateMsg`
 *
 * @since 0.1.0
 *
 * @example

{
"org.zstack.header.zone.APIChangeZoneStateEvent": {
"inventory": {
"uuid": "1b830f5bd1cb469b821b4b77babfdd6f",
"name": "test",
"description": "test",
"state": "Disabled",
"type": "zstack",
"createDate": "Apr 28, 2014 5:26:34 PM",
"lastOpDate": "Apr 28, 2014 5:26:34 PM"
},
"success": true
}
}
 */
public class APIChangeZoneStateEvent extends APIEvent {
    /**
     * @desc zone inventory (see :ref:`ZoneInventory`)
     */
	private ZoneInventory inventory;
	
	public APIChangeZoneStateEvent() {
		super(null);
	}
	
	public APIChangeZoneStateEvent(String apiId) {
	    super(apiId);
    }


	public ZoneInventory getInventory() {
    	return inventory;
    }


	public void setInventory(ZoneInventory inventory) {
    	this.inventory = inventory;
    }
}
