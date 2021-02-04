/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << DeviceBroker_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f1b93c96-40db-42e8-ab0a-e75030513208")
public class DeviceBrokerLifeline extends SwResourceLifeline {
    @objid ("219c31eb-070b-41ea-9eed-0e0ca75e40e5")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Lifeline";

    @objid ("60598150-108a-47c6-a216-c4943b11c0ac")
    public static final String DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Lifeline_accessPolicy";

    @objid ("8db19a0d-e001-4bb7-9d3d-9789e49a8ec6")
    public static final String DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE = "DeviceBroker_Lifeline_closeServices";

    @objid ("4abb835c-2dc1-4b77-8f35-2b4e7696f716")
    public static final String DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Lifeline_controlServices";

    @objid ("0110d71b-931d-47af-b364-e7764bae5c6d")
    public static final String DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE = "DeviceBroker_Lifeline_devices";

    @objid ("71c31788-947e-40a7-86b3-7fa6e261b546")
    public static final String DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE = "DeviceBroker_Lifeline_isBuffered";

    @objid ("c9d3d740-685b-4ff8-9bdf-08560096bc1d")
    public static final String DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE = "DeviceBroker_Lifeline_openServices";

    @objid ("d4d869fb-6537-4788-9e7e-dd4d277ecacd")
    public static final String DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE = "DeviceBroker_Lifeline_readServices";

    @objid ("bf57e07c-f9fe-4297-a2c1-6de20c8c477a")
    public static final String DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE = "DeviceBroker_Lifeline_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("53e89b38-880b-49f1-91bf-7e364868a03c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << DeviceBroker_Lifeline >> then instantiate a {@link DeviceBrokerLifeline} proxy.
     * 
     * @return a {@link DeviceBrokerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("217a927c-2a96-4ee2-8ff2-a2e25630e58e")
    public static DeviceBrokerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLifeline.STEREOTYPE_NAME);
        return DeviceBrokerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLifeline} proxy from a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link DeviceBrokerLifeline} proxy or <i>null</i>.
     */
    @objid ("bb0ab34f-85c4-4a9e-b6a6-66434bb855b3")
    public static DeviceBrokerLifeline instantiate(final Lifeline obj) {
        return DeviceBrokerLifeline.canInstantiate(obj) ? new DeviceBrokerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLifeline} proxy from a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link DeviceBrokerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e78c841a-b4b8-44d4-b7b2-57c0b360e4e4")
    public static DeviceBrokerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (DeviceBrokerLifeline.canInstantiate(obj))
        	return new DeviceBrokerLifeline(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8522ab57-6a53-4bfd-afff-c29b0c4a2060")
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
        DeviceBrokerLifeline other = (DeviceBrokerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24301206-15dc-4349-9259-e1dbbd1a73d4")
    public String getDeviceBroker_Lifeline_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ac49fb94-c128-4864-86d8-9f28af633adc")
    public List<String> getDeviceBroker_Lifeline_closeServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("45691f98-7db2-49e4-af47-24a615ef4ec0")
    public List<String> getDeviceBroker_Lifeline_controlServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5c0f1ec3-eeed-424a-8a6a-28e828f6e3c2")
    public List<String> getDeviceBroker_Lifeline_devices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c89b39ff-f33f-49a8-be9b-27554034d2a4")
    public List<String> getDeviceBroker_Lifeline_openServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5a2c9413-8640-443d-b3cc-48cfe41fb6a2")
    public List<String> getDeviceBroker_Lifeline_readServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6fc4eb83-272c-4c08-8ad3-9dc90542c4b7")
    public List<String> getDeviceBroker_Lifeline_writeServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("95c77573-3866-4427-b094-32e27e73c00c")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("669f6673-0f7f-4191-a2c0-a0ae81623bbf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Lifeline_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fd41653-cd99-4dbe-8e5d-42c831f834d9")
    public boolean isDeviceBroker_Lifeline_isBuffered() {
        return this.elt.isTagged(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39d2c5be-667b-45df-94b5-8cbe193d618a")
    public void setDeviceBroker_Lifeline_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("558758d7-7981-476d-8055-9681b4959a84")
    public void setDeviceBroker_Lifeline_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a1b8322-c24d-4b05-a42e-68f6d3bb5516")
    public void setDeviceBroker_Lifeline_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2401cca-6d36-4e99-be18-733a6c68aa64")
    public void setDeviceBroker_Lifeline_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Lifeline_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4d2a274-9df8-487f-9220-ffc92ceff8bb")
    public void setDeviceBroker_Lifeline_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("835e3ad8-0242-4d88-91e6-3e0d203bab56")
    public void setDeviceBroker_Lifeline_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fce844a7-d16f-4930-8f2d-8e2ecd17fe71")
    public void setDeviceBroker_Lifeline_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("36f07b62-4298-4618-a78c-e28611b9d1e1")
    public void setDeviceBroker_Lifeline_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("38dc467a-b19c-45fb-9ee3-d037672def77")
    protected DeviceBrokerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("cd7036a9-27fc-4bcf-b862-0d1d15a265dd")
    public static final class MdaTypes {
        @objid ("f1d0c7d1-b992-49f1-9893-c418a31d92b6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7838eb7b-cfd9-4ffe-bd69-c21c5ea3904c")
        public static TagType DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("ee1f5a65-b49c-4dcc-8762-3f0537425c35")
        public static TagType DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT;

        @objid ("cb22a606-598c-4649-8d09-8b5364ea118d")
        public static TagType DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT;

        @objid ("6453dfce-3cdb-4cb2-9b36-ec7607b56027")
        public static TagType DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("e38e79df-c749-4825-838c-276cabaf67e6")
        public static TagType DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("969be767-f6f7-4ca9-8a38-4ceed619a49a")
        public static TagType DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT;

        @objid ("d30f147b-8f62-407c-9c8c-8072e680b203")
        public static TagType DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT;

        @objid ("95fa46e6-ef35-4fb2-bd23-5ef9457fed84")
        public static TagType DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("534c9573-6c27-4058-88ed-e7b35eae81a7")
        private static Stereotype MDAASSOCDEP;

        @objid ("297d5960-efc7-4cc6-b4b6-9c24300dbdac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f672b082-cfec-49ed-bd15-74b9f5e213cd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "09bb9c94-10d2-11df-81d9-0014222a9f79");
            DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f435-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f436-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f437-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f438-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f439-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f43a-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f43b-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f43c-172e-11df-b92a-0014222a9f79");
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
