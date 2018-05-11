package de.schlangguru.restui.app.reducer

import de.schlangguru.restui.app.AppState
import de.schlangguru.restui.app.actions.*
import de.schlangguru.restui.core.mapIf

class Reducer {

    fun reduce(action: ServerStatusChangedAction, state: AppState): AppState {
        return state.copy(serverStatus = action.ServerStatus)
    }

    fun reduce(action: UpdateSettingsAction, state: AppState): AppState {
        return state.copy(
                host = action.host ?: state.host,
                port = action.port ?: state.port
        )
    }

    fun reduce(action: AddRequestAction, state: AppState): AppState {
        return state.copy(
                requestInbox = state.requestInbox + action.request
        )
    }

    fun reduce(action: AddMockResourceAction, state: AppState): AppState {
        return state.copy(
                mockResources = state.mockResources + action.mockResource
        )
    }

    fun reduce(action: RemoveMockResourceAction, state: AppState): AppState {
        return state.copy(
                mockResources = state.mockResources - action.mockResource
        )
    }

    // TODO Maybe its better to just update a whole MockResource at once
    fun reduce(action: UpdateMockResourceResponseAction, state: AppState): AppState {
//        val mockResources = state.mockResources.mapIf({ it.id == action.mockResourceID }) {
//            val responses = it.responses.mapIf({ it.name == action.response.name }) {
//                action.response
//            }
//            it.copy(responses = responses)
//        }
//
//        return state.copy(mockResources = mockResources)
        return state
    }
}