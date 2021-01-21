/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.activityaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("d13891ff-4a72-41e9-8714-18c17b40b6ba")
public class GCMInvocationActionActivityAction {
    @objid ("93fbef19-3a75-41f1-8393-d6b9ff302ef4")
    public static final String STEREOTYPE_NAME = "GCMInvocationAction_ActivityAction";

    @objid ("742f565d-e513-441d-9796-399e338247d2")
    public static final String GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE = "GCMInvocationAction_ActivityAction_onFeature";

    /**
     * The underlying {@link ActivityAction} represented by this proxy, never null.
     */
    @objid ("6add6377-b5cc-4ea7-b36f-05206e69af94")
    protected final ActivityAction elt;

    /**
     * Tells whether a {@link GCMInvocationActionActivityAction proxy} can be instantiated from a {@link MObject} checking it is a {@link ActivityAction} stereotyped << GCMInvocationAction_ActivityAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ff6efe17-a037-46e1-99cd-1a5664a91579")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ActivityAction) && ((ActivityAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocationActionActivityAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ActivityAction} stereotyped << GCMInvocationAction_ActivityAction >> then instantiate a {@link GCMInvocationActionActivityAction} proxy.
     * 
     * @return a {@link GCMInvocationActionActivityAction} proxy on the created {@link ActivityAction}.
     */
    @objid ("d7ea2e12-11f5-46e6-bec9-56952e9efef3")
    public static GCMInvocationActionActivityAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ActivityAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocationActionActivityAction.STEREOTYPE_NAME);
        return GCMInvocationActionActivityAction.instantiate((ActivityAction)e);
    }

    /**
     * Tries to instantiate a {@link GCMInvocationActionActivityAction} proxy from a {@link ActivityAction} stereotyped << GCMInvocationAction_ActivityAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ActivityAction
     * @return a {@link GCMInvocationActionActivityAction} proxy or <i>null</i>.
     */
    @objid ("e68b7b92-7a0a-415a-9fec-c3579371e7c1")
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
    @objid ("637ee3c1-b351-476b-89ab-d1596ca2cde3")
    public static GCMInvocationActionActivityAction safeInstantiate(final ActivityAction obj) throws IllegalArgumentException {
        if (GCMInvocationActionActivityAction.canInstantiate(obj))
        	return new GCMInvocationActionActivityAction(obj);
        else
        	throw new IllegalArgumentException("GCMInvocationActionActivityAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a56c8550-2506-47cc-a3af-869430e03feb")
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
    @objid ("56e526d2-26af-44b3-bb6d-3e70c6146215")
    public ActivityAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GCMInvocationAction_ActivityAction_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d22835d8-56da-40a5-b338-72d69bfd6a12")
    public String getGCMInvocationAction_ActivityAction_onFeature() {
        return this.elt.getTagValue(GCMInvocationActionActivityAction.MdaTypes.GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE_ELT);
    }

    @objid ("0555e33e-000b-498b-8301-eaf3616a4a1a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GCMInvocationAction_ActivityAction_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1da6a167-add9-4000-97a3-03eba3f05ddd")
    public void setGCMInvocationAction_ActivityAction_onFeature(final String value) {
        this.elt.putTagValue(GCMInvocationActionActivityAction.MdaTypes.GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE_ELT, value);
    }

    @objid ("f0abbeed-0ef6-4d41-a139-a0876f5b701c")
    protected GCMInvocationActionActivityAction(final ActivityAction elt) {
        this.elt = elt;
    }

    @objid ("64c6090c-0dea-4a45-a3fe-a3f0dd981b35")
    public static final class MdaTypes {
        @objid ("353bf509-e039-4227-afc1-84533f5621bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d61d84f8-a85c-497b-be2c-fdb9812d37d8")
        public static TagType GCMINVOCATIONACTION_ACTIVITYACTION_ONFEATURE_TAGTYPE_ELT;

        @objid ("98e29e77-e1f9-49ca-90bd-a5f39411a84f")
        private static Stereotype MDAASSOCDEP;

        @objid ("118c5e3e-3e35-4fdd-9137-e36c8b89ad90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("33f3ddd8-607c-4fb8-879f-5614aa29ef78")
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
