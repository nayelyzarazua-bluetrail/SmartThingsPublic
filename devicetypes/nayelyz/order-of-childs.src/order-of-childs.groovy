/**
 *  Test DTH for device events list.
,vid: "3ca50df8-4c24-3323-82d5-233083af007b", mnmn: "SmartThingsCommunity" //Color Temperature
,vid: "7f173faf-774d-33a8-856b-37d839889f35", mnmn: "SmartThingsCommunity" //Color Temperature local
schoolwater29967.doorspeed cappres1 87ca33c9-d11d-3de3-8a76-2361178dd572
 */
metadata {
    definition (name: "order-of-childs",namespace:"nayelyz", ocfDeviceType:"oic.d.smartlock", deviceTypeId: "SmartLock", author:"nayely",vid: "7c5f58d6-958b-3329-85d5-2371ea7ebc61", mnmn: "SmartThingsCommunity") {
        capability "rboyapps.arming"//D
        capability "lock"//D
        capability "alarm"
        capability "rboyapps.lockKeypad"
        capability "rboyapps.lockAutolock"
        capability "button"
        capability "battery"
        capability "powerSource"
        capability "tone"
        capability "refresh"
        //conditions - battery, alarm, lock, button???, powerSource
        //actions - alarm, lock, refresh
    }

    simulator {}

    tiles {}
}


def installed() {
    log.trace "Executing 'installed'"
    initialize()
}

def updated() {
    log.trace "Executing 'updated'"
    initialize()
}


private initialize() {
    log.trace "Executing 'initialize'"
	sendEvent(name: "armMode", value: "disarmed")
    sendEvent(name: "lock", value: "unlocked")
    sendEvent(name: "alarm", value: "off")
    sendEvent(name: "keypad", value: "disabled")
    sendEvent(name: "autolock", value: "disabled")
    sendEvent(name: "button", value: "pushed")
    sendEvent(name: "battery", value: "100")
}