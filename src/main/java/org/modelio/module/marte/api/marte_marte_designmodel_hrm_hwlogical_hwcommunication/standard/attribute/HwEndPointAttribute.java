/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("cad8131d-0535-44f1-830b-2a863fab83a7")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Attribute";

    @objid ("7ee8a987-0dd9-4659-ae92-8dc306a2d651")
    public static final String HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE = "HwEndPoint_Attribute_connectedTo";

    @objid ("2182cdc6-c19f-4dc0-8160-2591a57b89ae")
    public static final String HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwEndPoint_Attribute_description";

    @objid ("31d99b44-38c4-4862-9d6d-bf1323018389")
    public static final String HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwEndPoint_Attribute_frequency";

    @objid ("3afaf840-17fe-46b9-b8c9-ad09cbbaa7c0")
    public static final String HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwEndPoint_Attribute_ownedHW";

    @objid ("8cfa166c-b060-4a5a-8c17-649136c78e26")
    public static final String HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Attribute_p_HW_Services";

    @objid ("49883de2-11e7-4b4f-bb6c-5b36a6d837c9")
    public static final String HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwEndPoint_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("78e18c44-b66a-4efa-87a5-61f2edf48c6b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwEndPoint_Attribute >> then instantiate a {@link HwEndPointAttribute} proxy.
     * 
     * @return a {@link HwEndPointAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("d2449c18-9521-420e-8548-c81b55d55e25")
    public static HwEndPointAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAttribute.STEREOTYPE_NAME);
        return HwEndPointAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointAttribute} proxy from a {@link Attribute} stereotyped << HwEndPoint_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwEndPointAttribute} proxy or <i>null</i>.
     */
    @objid ("871e4326-10a9-419b-996c-51553787647d")
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
    @objid ("638c1bc6-c062-42ef-9f65-df9647607185")
    public static HwEndPointAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwEndPointAttribute.canInstantiate(obj))
        	return new HwEndPointAttribute(obj);
        else
        	throw new IllegalArgumentException("HwEndPointAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ed656f4-04c7-4ecd-b069-906218abe546")
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
    @objid ("7903dad5-2cfb-448a-a872-9503659f6414")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f5d9925c-948c-459c-aada-57307ebcafbc")
    public List<String> getHwEndPoint_Attribute_connectedTo() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3047f3b7-06e5-41f5-a7f0-51ce97d0b542")
    public String getHwEndPoint_Attribute_description() {
        return this.elt.getTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("25699c72-b4c7-45b6-be3f-fc1758c24973")
    public String getHwEndPoint_Attribute_frequency() {
        return this.elt.getTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f14db2d6-572e-4723-a22b-eb951c4d7930")
    public List<String> getHwEndPoint_Attribute_ownedHW() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3a1b9389-d83f-48e3-b529-3274e68bf2ba")
    public List<String> getHwEndPoint_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("746912b6-70ba-4432-986b-6e53ec1af623")
    public List<String> getHwEndPoint_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("33186afd-a92a-48fe-b61b-f09e698a5dc6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb3dac4f-ceda-45c5-b77c-dd07f00dc207")
    public void setHwEndPoint_Attribute_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54b3f9b5-a0e1-4f1a-a1b3-451211d122eb")
    public void setHwEndPoint_Attribute_description(final String value) {
        this.elt.putTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65be9dda-0d82-45a6-bcc1-9f5c6ff838bf")
    public void setHwEndPoint_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b45e163-e6f0-4cd8-9f2b-b04a53cd61ec")
    public void setHwEndPoint_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e33f68f0-73f6-4ad7-b281-900ff358cf83")
    public void setHwEndPoint_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e6b7009-1c74-4711-91d2-c9955bfe5475")
    public void setHwEndPoint_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAttribute.MdaTypes.HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("c6f4cafe-a5e6-4342-9f99-1269ee7274b0")
    protected HwEndPointAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("99f9dbd0-a5c1-4d43-897a-9e7ea6274fba")
    public static final class MdaTypes {
        @objid ("ce29c71f-38f9-4b9e-b645-189ea99b53d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7bb538c-c305-444d-9407-5751ba327329")
        public static TagType HWENDPOINT_ATTRIBUTE_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("584f1de9-b3a5-4f2b-ae2c-ac8cf84b087a")
        public static TagType HWENDPOINT_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("178f8258-aaa4-4b28-bfea-2b85e9764361")
        public static TagType HWENDPOINT_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a1456ef1-5bde-4a1b-963c-a14cc916ef29")
        public static TagType HWENDPOINT_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("357da5cb-079d-4a4b-8ae5-31e25867e99e")
        public static TagType HWENDPOINT_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("5932b4a3-afc0-482d-a62b-a0306e543ba1")
        public static TagType HWENDPOINT_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("3e99c035-fd0b-43ca-adb8-6e640e31300a")
        private static Stereotype MDAASSOCDEP;

        @objid ("6c688e87-9ecd-4ea8-8e02-09c1b890b12a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0433acc-820e-4ab3-94aa-62b9786ba70f")
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
