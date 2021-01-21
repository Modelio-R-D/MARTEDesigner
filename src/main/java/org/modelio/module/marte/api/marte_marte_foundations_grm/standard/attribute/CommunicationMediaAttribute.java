/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << CommunicationMedia_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c60f8e1c-4d3a-4573-8aca-7a220d6f3b85")
public class CommunicationMediaAttribute extends ProcessingResourceAttribute {
    @objid ("63876d69-1ca1-4b18-bc71-be8c63cf2558")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Attribute";

    @objid ("8c2233fe-53e1-419b-84cd-fbf5deb40449")
    public static final String COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT_TAGTYPE = "CommunicationMedia_Attribute_blockT";

    @objid ("f9a0738b-84b3-4e5d-a88d-037f879b0c95")
    public static final String COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY_TAGTYPE = "CommunicationMedia_Attribute_capacity";

    @objid ("2b95e185-4ce7-4188-9b44-5aa5f8fc3b65")
    public static final String COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Attribute_elementSize";

    @objid ("68d858a9-bec9-4269-a72d-05efe82b4215")
    public static final String COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT_TAGTYPE = "CommunicationMedia_Attribute_packetT";

    @objid ("2dd75fcf-e1e1-4c62-90aa-68eaf38254c1")
    public static final String COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE_TAGTYPE = "CommunicationMedia_Attribute_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << CommunicationMedia_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8b298742-8287-4421-8ca0-4fb476cce72f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << CommunicationMedia_Attribute >> then instantiate a {@link CommunicationMediaAttribute} proxy.
     * 
     * @return a {@link CommunicationMediaAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("96aadc57-dbc0-4b02-a9ab-4304fac160f5")
    public static CommunicationMediaAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAttribute.STEREOTYPE_NAME);
        return CommunicationMediaAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAttribute} proxy from a {@link Attribute} stereotyped << CommunicationMedia_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link CommunicationMediaAttribute} proxy or <i>null</i>.
     */
    @objid ("db82b150-2c8a-44f6-b713-75e6252d2949")
    public static CommunicationMediaAttribute instantiate(final Attribute obj) {
        return CommunicationMediaAttribute.canInstantiate(obj) ? new CommunicationMediaAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAttribute} proxy from a {@link Attribute} stereotyped << CommunicationMedia_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link CommunicationMediaAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("be962fef-5272-4dcf-8378-96b5af9fe596")
    public static CommunicationMediaAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (CommunicationMediaAttribute.canInstantiate(obj))
        	return new CommunicationMediaAttribute(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aa3e4530-b529-4ad5-a775-4c81e75a8260")
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
        CommunicationMediaAttribute other = (CommunicationMediaAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Attribute_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("74495359-a3e3-44e5-ac63-56c34bfc50eb")
    public List<String> getCommunicationMedia_Attribute_blockT() {
        return this.elt.getTagValues(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Attribute_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("06e2d8b9-563b-4699-87f2-9f7150028254")
    public List<String> getCommunicationMedia_Attribute_capacity() {
        return this.elt.getTagValues(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac61790f-e4e9-4951-a175-653d81f00669")
    public String getCommunicationMedia_Attribute_elementSize() {
        return this.elt.getTagValue(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Attribute_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a471def7-ac94-4134-a352-4d180a918455")
    public List<String> getCommunicationMedia_Attribute_packetT() {
        return this.elt.getTagValues(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fdb68ea4-49cc-475a-ac2b-6158708e78b7")
    public String getCommunicationMedia_Attribute_transmMode() {
        return this.elt.getTagValue(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("23d74fc8-9069-445e-ac0b-e2e2b490f8d4")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("b68f5bcd-8245-447b-b1a8-a8fdc94ec2b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Attribute_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6944dae9-d42c-41a0-acaa-65f5c7066af6")
    public void setCommunicationMedia_Attribute_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3db5ce91-7e64-4373-8134-263c593a46f6")
    public void setCommunicationMedia_Attribute_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e538828-6c92-49bc-a62b-1bb26cb567b2")
    public void setCommunicationMedia_Attribute_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Attribute_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e52abe09-0711-468f-a37d-83fda7325fcf")
    public void setCommunicationMedia_Attribute_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("36c46110-3d96-4660-9cca-16068d5c2ce3")
    public void setCommunicationMedia_Attribute_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaAttribute.MdaTypes.COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("1dc172a9-2df7-4203-98db-bca1814417e4")
    protected CommunicationMediaAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("057c4979-04bd-4971-bade-ebfd4bf0e731")
    public static final class MdaTypes {
        @objid ("704776c6-0fba-438c-a89b-30a11f62fd5b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c715c884-e93d-45b4-9222-f4a388d00c75")
        public static TagType COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("8e0ea3c2-eb9f-46a0-a811-62b03f590199")
        public static TagType COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("6c7b650c-45b0-4f41-9ac6-95c3cc1ddc8f")
        public static TagType COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT_TAGTYPE_ELT;

        @objid ("2d8a1c4e-4814-444e-97d0-704da4c87eb5")
        public static TagType COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT_TAGTYPE_ELT;

        @objid ("bbff712b-4463-456f-86de-d84859001f3f")
        public static TagType COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("b44a4597-f8bd-49c1-a9b5-85491955dbb3")
        private static Stereotype MDAASSOCDEP;

        @objid ("58f48c10-eb93-488c-81e2-a16609d10d2b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("15b75513-d5a5-44b5-ab5f-a224e4f1c44a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0095c02e-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c035-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098227c-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ATTRIBUTE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982283-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ATTRIBUTE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098228a-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ATTRIBUTE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982291-0ccf-11df-8525-001302895b2b");
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
