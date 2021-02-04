/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwInteractionResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("64c6b935-6c4b-45ee-a7d8-e3ad7e5be273")
public class SwInteractionResourceLifeline extends SwResourceLifeline {
    @objid ("107a2cf5-0ebc-4e4d-9a77-2e6609640791")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Lifeline";

    @objid ("52067990-a135-4277-864b-1487a3621e35")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction";

    @objid ("2fe34738-3178-4131-acc1-45e43b83f1ad")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Lifeline_waitingPolicyElements";

    @objid ("0d040a09-e302-4a87-9cde-30ba263238d7")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Lifeline_waitingQueueCapacity";

    @objid ("578e8f80-5206-4d12-bec1-f07a1d0a8a6f")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Lifeline_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6b8827b4-e823-4a9a-8bf0-b32f81db8813")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >> then instantiate a {@link SwInteractionResourceLifeline} proxy.
     * 
     * @return a {@link SwInteractionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("7e575800-0555-4f10-bf79-59f3f9c328ee")
    public static SwInteractionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLifeline.STEREOTYPE_NAME);
        return SwInteractionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwInteractionResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("f3a25224-9dae-41c7-a3ed-85a43759cb9e")
    public static SwInteractionResourceLifeline instantiate(final Lifeline obj) {
        return SwInteractionResourceLifeline.canInstantiate(obj) ? new SwInteractionResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwInteractionResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4c332cff-8760-4b54-83bd-f22a4c21424c")
    public static SwInteractionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwInteractionResourceLifeline.canInstantiate(obj))
        	return new SwInteractionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3721f036-c142-4642-b5b5-60062c8fb523")
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
        SwInteractionResourceLifeline other = (SwInteractionResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("12506872-6731-499c-8655-39b2482acd45")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Lifeline_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("86355e08-085b-4d2b-8635-a891472d2c10")
    public List<String> getSwInteractionResource_Lifeline_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Lifeline_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58e0b4eb-f936-4139-af2b-5f496194eb83")
    public String getSwInteractionResource_Lifeline_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Lifeline_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff8f6a37-0c8a-48b2-bf91-ecee1ed96021")
    public String getSwInteractionResource_Lifeline_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("e344c3b7-6a94-4276-89c7-47d4af47bb03")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7995f47-a2bf-4624-89aa-ab043f43903c")
    public boolean isSwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb67f5bb-8ef4-41ac-9134-61ec43e19ace")
    public void setSwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Lifeline_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b85f462-11d2-4eec-9548-de5a678cc665")
    public void setSwInteractionResource_Lifeline_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Lifeline_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0362491-8491-4dda-87e3-fb0c1065430e")
    public void setSwInteractionResource_Lifeline_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Lifeline_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfa02568-f3b0-4052-b9c9-d4b255df3209")
    public void setSwInteractionResource_Lifeline_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("12aaddd0-682c-4711-bc27-b5c6ca97ac71")
    protected SwInteractionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("53ad73c1-b939-47b5-9da0-a7f75679ea2f")
    public static final class MdaTypes {
        @objid ("96d9f508-79ae-4eb7-9d13-b496cc8d71e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d65a0b2-292e-4435-9775-b25218f5f21f")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("32cffb37-eecc-44d3-ab78-4673f64e5147")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("1065e22d-d278-42ff-9af6-31b78371fee4")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("91aad1e9-c45d-4f73-9c2e-b78a48f92242")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("bd6560ee-2705-45ff-8a7d-c336e2073435")
        private static Stereotype MDAASSOCDEP;

        @objid ("2ce227f4-c488-4349-b8d8-88b16825030d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2eebf6ae-b786-4c87-ab94-a2ad0487de99")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe080db2-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db3-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db4-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db5-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db6-10d8-11df-81d9-0014222a9f79");
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
