/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter.SwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwInteractionResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("da180dbb-bf38-49e8-9e8a-55cb7965b0a1")
public class SwInteractionResourceParameter extends SwResourceParameter {
    @objid ("01298944-3a26-4d1e-bcea-33dfcbb35f41")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Parameter";

    @objid ("9f8d3993-5433-43ec-aad5-6190f6404ca0")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction";

    @objid ("c51de3d1-871b-4a63-add0-bf015b6d4fad")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Parameter_waitingPolicyElements";

    @objid ("21a90487-3756-4ebd-9851-e343f3775ab2")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Parameter_waitingQueueCapacity";

    @objid ("e256afb6-d3dd-4b1d-aac1-2bb2cb06052c")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Parameter_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwInteractionResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("18f9d117-9518-4c09-9920-d9013a8f528e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwInteractionResource_Parameter >> then instantiate a {@link SwInteractionResourceParameter} proxy.
     * 
     * @return a {@link SwInteractionResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("d3cdbf18-c496-45c4-93c2-99e9f06f47ea")
    public static SwInteractionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceParameter.STEREOTYPE_NAME);
        return SwInteractionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceParameter} proxy from a {@link Parameter} stereotyped << SwInteractionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwInteractionResourceParameter} proxy or <i>null</i>.
     */
    @objid ("04479905-f977-47c5-9734-268d0443bdb2")
    public static SwInteractionResourceParameter instantiate(final Parameter obj) {
        return SwInteractionResourceParameter.canInstantiate(obj) ? new SwInteractionResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceParameter} proxy from a {@link Parameter} stereotyped << SwInteractionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwInteractionResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("52d849a9-3a52-47c2-bbbe-b15ac865c78e")
    public static SwInteractionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwInteractionResourceParameter.canInstantiate(obj))
        	return new SwInteractionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6336e8b7-4555-469d-8b72-84eb76f1c853")
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
        SwInteractionResourceParameter other = (SwInteractionResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("bda40f56-6268-4bde-b2b0-67f04e1d276d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Parameter_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7b13297c-fe45-455d-81ec-e4248d5f32fd")
    public List<String> getSwInteractionResource_Parameter_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Parameter_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69c76536-f1cf-41c4-803f-a5379e0003ff")
    public String getSwInteractionResource_Parameter_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Parameter_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db4cd456-4fb7-40c6-a40e-2bb1fde9f5d7")
    public String getSwInteractionResource_Parameter_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("c4d106c6-1f49-4f28-8bdf-17b5533d054f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4ca3df7-4c7f-45f4-9188-a8f91aca2eef")
    public boolean isSwInteractionResource_Parameter_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49784044-bcde-478c-81f3-8c2c5ce18878")
    public void setSwInteractionResource_Parameter_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Parameter_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de318b97-7652-45b8-8ddf-20698451cd0f")
    public void setSwInteractionResource_Parameter_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Parameter_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("336620a5-2e7c-4c3a-9282-045c27aabb91")
    public void setSwInteractionResource_Parameter_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Parameter_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d942606d-707d-4279-b972-2c43e18cfe19")
    public void setSwInteractionResource_Parameter_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("6b060c0f-7ea4-4cc7-bea9-62f59f73f989")
    protected SwInteractionResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("3f8d0d7a-6917-4919-ab2e-b2dd129b9924")
    public static final class MdaTypes {
        @objid ("b39ddadc-06d2-435e-924c-8ceee5fc76b8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4947e10e-cc29-49d9-b618-b489cbbb99db")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("afbf9e41-a6da-4c59-9966-c42fbce04dfd")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("630ce13b-1965-4948-a228-34465e622829")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("b246a434-13f3-4c56-83c0-969cc2546069")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("13ce8d3e-4c9b-42b9-8c2a-64b637d35b15")
        private static Stereotype MDAASSOCDEP;

        @objid ("d787fb60-eca9-44b1-b53e-a2c657ef1c7c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27ac8861-a6c1-4374-8aae-c41cedc22bd6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "020747ec-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c7a-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c81-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c88-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c8f-0ccf-11df-8525-001302895b2b");
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
