/**
 *  Test DTH for device events list.
,vid: "3ca50df8-4c24-3323-82d5-233083af007b", mnmn: "SmartThingsCommunity" //Color Temperature
,vid: "7f173faf-774d-33a8-856b-37d839889f35", mnmn: "SmartThingsCommunity" //Color Temperature local
schoolwater29967.doorspeed cappres1 87ca33c9-d11d-3de3-8a76-2361178dd572
 */
metadata {
    definition (name: "firebutton-child",namespace:"nayelyz", author:"nayely",vid: "", mnmn: "SmartThingsCommunity") {
        capability "button"
        //conditions - button
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
    sendEvent(name: "button", value: "pushed")
}