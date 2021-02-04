/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.CommunicationEndPointAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwEndPoint_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("40b25836-c888-42c8-a1b9-0f5302b22f58")
public class HwEndPointAttribute extends CommunicationEndPointAttribute {
    @objid ("58064b7d-d622-406c-9fef-01af8793da3f")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Attribute";

    @objid ("2932f738-f091-42f6-ab45-56026feaa763")
    public static final String HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE = "HwEndPoint_Attribute_connectedTo";

    @objid ("1c3d8ba0-e8cd-4b37-accf-be9dc56892eb")
    public static final String HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwEndPoint_Attribute_description";

    @objid ("38be1077-bc54-42ae-abaf-d80c88eb9e56")
    public static final String HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwEndPoint_Attribute_frequency";

    @objid ("fa8b0908-d17f-4654-8198-2a0cac5e6041")
    public static final String HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwEndPoint_Attribute_ownedHW";

    @objid ("bcb30433-860c-44d5-b3de-2bacf4a4deb0")
    public static final String HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Attribute_p_HW_Services";

    @objid ("63bad2cf-33e9-44d6-b22e-e325cd3f56c4")
    public static final String HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwEndPoint_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0658e2fc-ffbb-4748-88af-4a7090c85c91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwEndPoint_Attribute >> then instantiate a {@link HwEndPointAttribute} proxy.
     * 
     * @return a {@link HwEndPointAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("fde9e4f6-4794-480f-8f57-95194659ffcc")
    public static HwEndPointAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAttribute.STEREOTYPE_NAME);
        return HwEndPointAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointAttribute} proxy from a {@link Attribute} stereotyped << HwEndPoint_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwEndPointAttribute} proxy or <i>null</i>.
     */
    @objid ("fa38268e-1374-489b-8c96-441c30709214")
    public static HwEndPointAttribute instantiate(final Attribute obj) {
        return HwEndPointAttribute.canInstantiate(obj) ? new HwEndPointAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointAttribute} proxy from a {@link Attribute} stereotyped << HwEndPoint_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwEndPointAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fee88939-4924-43b5-8594-c6ee2f076348")
    public static HwEndPointAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwEndPointAttribute.canInstantiate(obj))
        	return new HwEndPointAttribute(obj);
        else
        	throw new IllegalArgumentException("HwEndPointAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ea084173-7440-49ae-a781-dd6bd95d1b3c")
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
        HwEndPointAttribute other = (HwEndPointAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("36d9f481-a0af-482c-8b9d-96ecb32dee63")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4b08ee69-ad66-41ec-adce-d6dda96730a0")
    public List<String> getHwEndPoint_Attribute_connectedTo() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b78c9dd2-b5a6-4eb1-b8c2-cb7630ff1b93")
    public String getHwEndPoint_Attribute_description() {
        return this.elt.getTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbe68108-17a9-4e28-81ad-adbedb4040cf")
    public String getHwEndPoint_Attribute_frequency() {
        return this.elt.getTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5673a3fe-4f0d-4f2e-9145-610840a64e90")
    public List<String> getHwEndPoint_Attribute_ownedHW() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("40982ec6-7e25-4f2b-b365-9aa3ebcae629")
    public List<String> getHwEndPoint_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0684b608-5c3f-4a07-ab4b-85de17d0accf")
    public List<String> getHwEndPoint_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("f360514a-941f-41b4-a4f9-dae73e86401b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f05555c5-3cf5-42ab-a99d-7c4916b235e6")
    public void setHwEndPoint_Attribute_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9236ebb9-f1d0-4af6-ab6e-dc8f07edd879")
    public void setHwEndPoint_Attribute_description(final String value) {
        this.elt.putTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bb14ee5-ce8c-4db3-9a06-e155b8c4116f")
    public void setHwEndPoint_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52a3a188-5e67-4fca-98a3-ee7166be5a3c")
    public void setHwEndPoint_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55c4582b-e314-4dca-bef4-c0108c8c8724")
    public void setHwEndPoint_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0cccf1f-7df4-425a-bdf1-2094173fd350")
    public void setHwEndPoint_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("8e9678a9-d4ea-41f2-8312-3ddd194ac04b")
    protected HwEndPointAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("99f9dbd0-a5c1-4d43-897a-9e7ea6274fba")
    public static final class MdaTypes {
        @objid ("076e61e2-1dd0-47cb-88f4-247aa6ad8b43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ef2dfd0-9c7a-4bff-9669-1fa20a73436d")
        public static TagType HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("9f80a945-f92f-4ad8-a10c-d250cf1c9a56")
        public static TagType HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("9b1d7d26-2e4a-4072-a161-2f3e79088efb")
        public static TagType HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("1fb003a7-0599-4636-ae57-6d2907767589")
        public static TagType HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("e43eeb69-f27c-45ed-821f-5abb887a5e13")
        public static TagType HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("79631786-708a-4f79-a43e-d10de8516606")
        public static TagType HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("e0116bb1-8be0-4b98-992a-8bdb42e91667")
        private static Stereotype MDAASSOCDEP;

        @objid ("1fe460ed-a5e3-4856-93e9-5eab931dab3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e9bb536-8f6c-4747-b03a-eaa4027f3886")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "010cf430-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e2ff8765-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4aaff7b4-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4ab01ec5-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4ab01ec6-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4ab01ec7-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4ab01ec8-92a9-11e0-a69d-0027103f347c");
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
