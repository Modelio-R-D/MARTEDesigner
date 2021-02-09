/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.activityaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ActivityAction} with << GCMInvocationAction_ActivityAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GCMInvocationActionActivityAction {
    public static final String STEREOTYPE_NAME = "GCMInvocationAction_ActivityAction";

    public static final String GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE = "GCMInvocationAction_ActivityAction_onFeature";

    /**
     * The underlying {@link ActivityAction} represented by this proxy, never null.
     */
    protected final ActivityAction elt;

    /**
     * Tells whether a {@link GCMInvocationActionActivityAction proxy} can be instantiated from a {@link MObject} checking it is a {@link ActivityAction} stereotyped << GCMInvocationAction_ActivityAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ActivityAction) && ((ActivityAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocationActionActivityAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ActivityAction} stereotyped << GCMInvocationAction_ActivityAction >> then instantiate a {@link GCMInvocationActionActivityAction} proxy.
     * 
     * @return a {@link GCMInvocationActionActivityAction} proxy on the created {@link ActivityAction}.
     */
    public static GCMInvocationActionActivityAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ActivityAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocationActionActivityAction.STEREOTYPE_NAME);
        return GCMInvocationActionActivityAction.instantiate((ActivityAction)e);
    }

    /**
     * Tries to instantiate a {@link GCMInvocationActionActivityAction} proxy from a {@link ActivityAction} stereotyped << GCMInvocationAction_ActivityAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ActivityAction
     * @return a {@link GCMInvocationActionActivityAction} proxy or <i>null</i>.
     */
    public static GCMInvocationActionActivityAction instantiate(final ActivityAction obj) {
        return GCMInvocationActionActivityAction.canInstantiate(obj) ? new GCMInvocationActionActivityAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GCMInvocationActionActivityAction} proxy from a {@link ActivityAction} stereotyped << GCMInvocationAction_ActivityAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ActivityAction}
     * @return a {@link GCMInvocationActionActivityAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GCMInvocationActionActivityAction safeInstantiate(final ActivityAction obj) throws IllegalArgumentException {
        if (GCMInvocationActionActivityAction.canInstantiate(obj))
        	return new GCMInvocationActionActivityAction(obj);
        else
        	throw new IllegalArgumentException("GCMInvocationActionActivityAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GCMInvocationActionActivityAction other = (GCMInvocationActionActivityAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ActivityAction}. 
     * @return the ActivityAction represented by this proxy, never null.
     */
    public ActivityAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GCMInvocationAction_ActivityAction_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGCMInvocationAction_ActivityAction_onFeature() {
        return this.elt.getTagValue(GCMInvocationActionActivityAction.MdaTypes.GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GCMInvocationAction_ActivityAction_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGCMInvocationAction_ActivityAction_onFeature(final String value) {
        this.elt.putTagValue(GCMInvocationActionActivityAction.MdaTypes.GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE_ELT, value);
    }

    protected GCMInvocationActionActivityAction(final ActivityAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "70c383bc-a32a-11e1-8263-0027103f347d");
            GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b537b088-12ef-4d61-9881-dee84c5ef093");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
