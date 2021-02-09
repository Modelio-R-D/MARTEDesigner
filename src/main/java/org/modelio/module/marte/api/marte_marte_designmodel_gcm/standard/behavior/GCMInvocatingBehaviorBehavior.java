/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << GCMInvocatingBehavior_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GCMInvocatingBehaviorBehavior {
    public static final String STEREOTYPE_NAME = "GCMInvocatingBehavior_Behavior";

    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE = "GCMInvocatingBehavior_Behavior_invocations";

    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE = "GCMInvocatingBehavior_Behavior_onFeature";

    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE = "GCMInvocatingBehavior_Behavior_onPort";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    protected final Behavior elt;

    /**
     * Tells whether a {@link GCMInvocatingBehaviorBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocatingBehaviorBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >> then instantiate a {@link GCMInvocatingBehaviorBehavior} proxy.
     * 
     * @return a {@link GCMInvocatingBehaviorBehavior} proxy on the created {@link Behavior}.
     */
    public static GCMInvocatingBehaviorBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocatingBehaviorBehavior.STEREOTYPE_NAME);
        return GCMInvocatingBehaviorBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GCMInvocatingBehaviorBehavior} proxy from a {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GCMInvocatingBehaviorBehavior} proxy or <i>null</i>.
     */
    public static GCMInvocatingBehaviorBehavior instantiate(final Behavior obj) {
        return GCMInvocatingBehaviorBehavior.canInstantiate(obj) ? new GCMInvocatingBehaviorBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GCMInvocatingBehaviorBehavior} proxy from a {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link GCMInvocatingBehaviorBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GCMInvocatingBehaviorBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GCMInvocatingBehaviorBehavior.canInstantiate(obj))
        	return new GCMInvocatingBehaviorBehavior(obj);
        else
        	throw new IllegalArgumentException("GCMInvocatingBehaviorBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GCMInvocatingBehaviorBehavior other = (GCMInvocatingBehaviorBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_invocations'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGCMInvocatingBehavior_Behavior_invocations() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGCMInvocatingBehavior_Behavior_onFeature() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_onPort'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGCMInvocatingBehavior_Behavior_onPort() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_invocations'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGCMInvocatingBehavior_Behavior_invocations(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGCMInvocatingBehavior_Behavior_onFeature(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_onPort'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGCMInvocatingBehavior_Behavior_onPort(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT, value);
    }

    protected GCMInvocatingBehaviorBehavior(final Behavior elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT;

        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT;

        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "044fadde-a329-11e1-8263-0027103f347d");
            GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "053c63ec-a329-11e1-8263-0027103f347d");
            GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06ccdc6c-a329-11e1-8263-0027103f347d");
            GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "55c50898-a32a-11e1-8263-0027103f347d");
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
