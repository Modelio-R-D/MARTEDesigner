/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link.HwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwISA_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("98c7c793-d8e5-4dac-9d48-cf6bc9b31dfe")
public class HwISALink extends HwResourceLink {
    @objid ("ab02bb84-b32d-440b-9307-9b247364d35b")
    public static final String STEREOTYPE_NAME = "HwISA_Link";

    @objid ("910721c3-2dd6-497c-b67f-22cf85ba6f95")
    public static final String HWISA_LINK_FAMILY_TAGTYPE = "HwISA_Link_family";

    @objid ("cc1f9ef9-b8d8-4c92-8eda-918eacae7b2d")
    public static final String HWISA_LINK_INST_WIDTH_TAGTYPE = "HwISA_Link_inst_Width";

    @objid ("d38d8f84-8f89-4efd-89a3-db1472fc9180")
    public static final String HWISA_LINK_TYPE_TAGTYPE = "HwISA_Link_type";

    /**
     * Tells whether a {@link HwISALink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwISA_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("497f849c-c5dd-4de2-9ce3-8da2fbcddae2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISALink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwISA_Link >> then instantiate a {@link HwISALink} proxy.
     * 
     * @return a {@link HwISALink} proxy on the created {@link Link}.
     */
    @objid ("b4fe11f1-4ab5-4628-ad4b-7e533da1eb82")
    public static HwISALink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISALink.STEREOTYPE_NAME);
        return HwISALink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwISALink} proxy from a {@link Link} stereotyped << HwISA_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwISALink} proxy or <i>null</i>.
     */
    @objid ("067f27a5-10aa-4357-9197-14d7064b35f8")
    public static HwISALink instantiate(final Link obj) {
        return HwISALink.canInstantiate(obj) ? new HwISALink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISALink} proxy from a {@link Link} stereotyped << HwISA_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwISALink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("970e4c31-3a67-4e4e-82ba-6e35ca1d9fab")
    public static HwISALink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwISALink.canInstantiate(obj))
        	return new HwISALink(obj);
        else
        	throw new IllegalArgumentException("HwISALink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a85c43b3-0a32-4f9e-85ca-d75bc6d5e351")
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
        HwISALink other = (HwISALink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("b01958a7-0aef-4b0c-8aa9-878c214e6bb8")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Link_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56e52836-c067-4b5f-bae6-26d76e790df7")
    public String getHwISA_Link_family() {
        return this.elt.getTagValue(HwISALink.MdaTypes.HWISA_LINK_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Link_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70cf05f6-c611-4053-ae5a-025da682b47a")
    public String getHwISA_Link_inst_Width() {
        return this.elt.getTagValue(HwISALink.MdaTypes.HWISA_LINK_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1008d377-e410-4707-b2c6-314e460968b9")
    public String getHwISA_Link_type() {
        return this.elt.getTagValue(HwISALink.MdaTypes.HWISA_LINK_TYPE_TAGTYPE_ELT);
    }

    @objid ("ec6ea94b-064b-44bd-a90c-fe870a69b3e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Link_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45bb386a-ac9a-4c86-962d-55dcf0de94d5")
    public void setHwISA_Link_family(final String value) {
        this.elt.putTagValue(HwISALink.MdaTypes.HWISA_LINK_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Link_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb4ce154-dc41-4659-9b93-de0abfbb250c")
    public void setHwISA_Link_inst_Width(final String value) {
        this.elt.putTagValue(HwISALink.MdaTypes.HWISA_LINK_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29812b6a-8760-4208-bd0c-3d93fb7b15ed")
    public void setHwISA_Link_type(final String value) {
        this.elt.putTagValue(HwISALink.MdaTypes.HWISA_LINK_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("f6b8b7a0-8557-44c1-811c-46e1d958c93b")
    protected HwISALink(final Link elt) {
        super(elt);
    }

    @objid ("d30ed5b7-e7d3-4a22-b6e3-1f08b08ee36f")
    public static final class MdaTypes {
        @objid ("bd4002d9-a008-4112-ad26-c3be062d8db3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("39e3cb49-bd47-4525-8c1a-d911456a18ba")
        public static TagType HWISA_LINK_FAMILY_TAGTYPE_ELT;

        @objid ("df04dcb8-ba6a-45d4-b8e7-4fdab5f40211")
        public static TagType HWISA_LINK_INST_WIDTH_TAGTYPE_ELT;

        @objid ("1901036e-fe7a-4a7b-a97f-d849dc5579a6")
        public static TagType HWISA_LINK_TYPE_TAGTYPE_ELT;

        @objid ("d733eacd-59b6-4213-8ad5-859b410abe44")
        private static Stereotype MDAASSOCDEP;

        @objid ("5d8db08e-268f-46a1-b40b-2006737d3430")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("017080b1-a7ff-49bb-b8ce-cc9e0d1a6175")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f77f51-0ccf-11df-8525-001302895b2b");
            HWISA_LINK_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f58-0ccf-11df-8525-001302895b2b");
            HWISA_LINK_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f5f-0ccf-11df-8525-001302895b2b");
            HWISA_LINK_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f66-0ccf-11df-8525-001302895b2b");
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
