/**
 *  Test DTH for device events list.
,vid: "3ca50df8-4c24-3323-82d5-233083af007b", mnmn: "SmartThingsCommunity" //Color Temperature
,vid: "7f173faf-774d-33a8-856b-37d839889f35", mnmn: "SmartThingsCommunity" //Color Temperature local
schoolwater29967.doorspeed cappres1 87ca33c9-d11d-3de3-8a76-2361178dd572
 */
metadata {
	definition (name: "testswitchlevelcap",namespace:"nayelyz", author:"nayely",vid: "59110d01-5da7-31be-9909-3825393b1907", mnmn: "SmartThingsCommunity") {
        capability "switch level"
	}

	simulator {}

	tiles {}
}

/*def setZoneSetpoint(Integer arg) {
	log.trace "parse($description)"
    sendEvent(name: "zoneSetpoint", value: "20")
}*/

def installed() {
	log.trace "Executing 'installed'"
	initialize()
}

def updated() {
	log.trace "Executing 'updated'"
	initialize()
}

def setLevel(arg){
log.trace "${arg}"
	sendEvent(name: "level", value: level)
}

private initialize() {
	log.trace "Executing 'initialize'"
	sendEvent(name: "level", value: "10")
}