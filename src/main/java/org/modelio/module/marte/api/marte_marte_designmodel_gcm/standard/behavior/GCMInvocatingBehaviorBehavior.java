/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("dd785d29-9a91-4825-ba8c-66acf63445ce")
public class GCMInvocatingBehaviorBehavior {
    @objid ("c1d22a74-328d-439a-9424-e0c05582985c")
    public static final String STEREOTYPE_NAME = "GCMInvocatingBehavior_Behavior";

    @objid ("af9c58c0-5365-45ab-a7cf-d16c3f50e518")
    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE = "GCMInvocatingBehavior_Behavior_invocations";

    @objid ("f3640942-bd99-4722-bfa1-28375924537f")
    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE = "GCMInvocatingBehavior_Behavior_onFeature";

    @objid ("bcf8250e-4924-4bc7-b6a3-63c099538733")
    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE = "GCMInvocatingBehavior_Behavior_onPort";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("3e623507-54f6-4584-ad10-cb1f69d59851")
    protected final Behavior elt;

    /**
     * Tells whether a {@link GCMInvocatingBehaviorBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("27b9a743-a43c-4a01-b2b9-99ca67a426ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocatingBehaviorBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >> then instantiate a {@link GCMInvocatingBehaviorBehavior} proxy.
     * 
     * @return a {@link GCMInvocatingBehaviorBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("fee82455-c1c1-42a8-aa15-e75a4e75f45e")
    public static GCMInvocatingBehaviorBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocatingBehaviorBehavior.STEREOTYPE_NAME);
        return GCMInvocatingBehaviorBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GCMInvocatingBehaviorBehavior} proxy from a {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GCMInvocatingBehaviorBehavior} proxy or <i>null</i>.
     */
    @objid ("0d541652-69e3-4cce-9321-ef1e377788e5")
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
    @objid ("096d5406-5698-4092-925f-0c0b598c4080")
    public static GCMInvocatingBehaviorBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GCMInvocatingBehaviorBehavior.canInstantiate(obj))
        	return new GCMInvocatingBehaviorBehavior(obj);
        else
        	throw new IllegalArgumentException("GCMInvocatingBehaviorBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("99882e30-272c-4170-ace9-043af32d18f8")
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
    @objid ("2561c581-e893-410f-a870-7c1550c55953")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_invocations'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18882d63-94d0-4205-83d9-aadca3917f7d")
    public String getGCMInvocatingBehavior_Behavior_invocations() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d167a9b-b459-42ee-b7f9-0063d01fdfd2")
    public String getGCMInvocatingBehavior_Behavior_onFeature() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_onPort'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59f50cde-6cde-4aae-b3a4-4380cb0932eb")
    public String getGCMInvocatingBehavior_Behavior_onPort() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT);
    }

    @objid ("2168e1ec-fa4c-4d5d-aea5-5de20b4bc02f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_invocations'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aee346f7-ffaa-4213-98f8-6b88fd029235")
    public void setGCMInvocatingBehavior_Behavior_invocations(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dec0932b-f862-4943-beb0-d5e8dce66aea")
    public void setGCMInvocatingBehavior_Behavior_onFeature(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_onPort'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30576914-3594-498a-87d8-6812d611951c")
    public void setGCMInvocatingBehavior_Behavior_onPort(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT, value);
    }

    @objid ("93abd48c-4574-4085-9e39-b11cee402ca2")
    protected GCMInvocatingBehaviorBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("5b574192-2782-4de5-aceb-68ae39a869b5")
    public static final class MdaTypes {
        @objid ("42f5aeb1-6d15-4f3e-9e58-a04424813014")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67972ce9-9c38-45d0-a206-6e7dceac9065")
        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT;

        @objid ("69ef61bb-397c-488b-be7b-62a749137608")
        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT;

        @objid ("5202c044-206e-46ac-9389-ccfa56b2e091")
        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT;

        @objid ("e99d1580-f823-4f67-b107-086d59b25859")
        private static Stereotype MDAASSOCDEP;

        @objid ("b95a432f-8602-4a2e-be4f-a91493320a4e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("586c3d02-44f5-49c6-ae7c-6542f74e1d85")
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
