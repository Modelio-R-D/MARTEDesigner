/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("3fc4f5cb-dd26-4b0f-bd69-ee163df61fe4")
    public static final String STEREOTYPE_NAME = "GCMInvocatingBehavior_Behavior";

    @objid ("8103497e-a41b-4514-b319-dc0858b6196c")
    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE = "GCMInvocatingBehavior_Behavior_invocations";

    @objid ("c1aa2260-4746-484c-abb9-bc07ab6109b2")
    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE = "GCMInvocatingBehavior_Behavior_onFeature";

    @objid ("331dd63f-4f04-4800-b26b-883c0c5793ab")
    public static final String GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE = "GCMInvocatingBehavior_Behavior_onPort";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("afb6b856-200c-4177-a589-7495f27149e4")
    protected final Behavior elt;

    /**
     * Tells whether a {@link GCMInvocatingBehaviorBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("18ddce63-45eb-4fc8-9c19-951f194dca39")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GCMInvocatingBehaviorBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GCMInvocatingBehavior_Behavior >> then instantiate a {@link GCMInvocatingBehaviorBehavior} proxy.
     * 
     * @return a {@link GCMInvocatingBehaviorBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("17530146-963b-4572-a896-a897127092d4")
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
    @objid ("307d4b9e-0593-4ac2-b58c-73bdf2ccf54c")
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
    @objid ("516c9c0b-2e24-443f-814d-e519e1de018d")
    public static GCMInvocatingBehaviorBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GCMInvocatingBehaviorBehavior.canInstantiate(obj))
        	return new GCMInvocatingBehaviorBehavior(obj);
        else
        	throw new IllegalArgumentException("GCMInvocatingBehaviorBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7d3fcccf-bb7e-468a-ad95-cbd19b6224a6")
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
    @objid ("57850bab-ea38-4176-853c-8989a842c464")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_invocations'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("868c257e-acff-41d8-a471-7b2f40c0367f")
    public String getGCMInvocatingBehavior_Behavior_invocations() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4097db88-df0a-4389-a227-42007286868f")
    public String getGCMInvocatingBehavior_Behavior_onFeature() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GCMInvocatingBehavior_Behavior_onPort'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2d76965-3f0f-45a6-a0c8-ba36ccee820f")
    public String getGCMInvocatingBehavior_Behavior_onPort() {
        return this.elt.getTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT);
    }

    @objid ("791dc706-40cd-4670-8793-74723bcc1ffa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_invocations'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3127ca27-e310-4f5c-b9d9-50d62a94a798")
    public void setGCMInvocatingBehavior_Behavior_invocations(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_onFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d743e36-2aa3-4ec7-9525-830486a6215b")
    public void setGCMInvocatingBehavior_Behavior_onFeature(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GCMInvocatingBehavior_Behavior_onPort'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9891562b-c2e6-43e5-86ff-f66f1aeeb66f")
    public void setGCMInvocatingBehavior_Behavior_onPort(final String value) {
        this.elt.putTagValue(GCMInvocatingBehaviorBehavior.MdaTypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT, value);
    }

    @objid ("b2f817ea-a52c-42de-8b98-9b5d36db0003")
    protected GCMInvocatingBehaviorBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("5b574192-2782-4de5-aceb-68ae39a869b5")
    public static final class MdaTypes {
        @objid ("fa3e9e46-666c-449b-860d-f1154aad0744")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0d1fc3e4-57f4-4cd4-b64b-fe958a070379")
        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONPORT_TAGTYPE_ELT;

        @objid ("d39b910f-c719-4bcf-9e5a-4ce6e3cb5fb8")
        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_ONFEATURE_TAGTYPE_ELT;

        @objid ("f2c69830-43cb-4c92-8098-2ea5972630c4")
        public static TagType GCMINVOCATINGBEHAVIOR_BEHAVIOR_INVOCATIONS_TAGTYPE_ELT;

        @objid ("868b9946-3309-4707-960a-fb73dc70f90f")
        private static Stereotype MDAASSOCDEP;

        @objid ("234c2cd7-cfa6-45c3-84d2-c2577b2ce7ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a66cece2-b500-4101-bb01-f741b4153fd1")
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
