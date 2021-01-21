/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << CommunicationMedia_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("20ea83bb-6059-4899-81e4-fab13b69cdd4")
public class CommunicationMediaAssociationEnd extends ProcessingResourceAssociationEnd {
    @objid ("f01bd63c-1d44-4eb6-8213-7b4e6e21272b")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_AssociationEnd";

    @objid ("f8371277-b67b-4a0f-a659-1f034e56af0e")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE = "CommunicationMedia_AssociationEnd_blockT";

    @objid ("0b900259-bcb3-42b9-9a4a-c5b3cc7b57cd")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE = "CommunicationMedia_AssociationEnd_capacity";

    @objid ("758fa2ea-5153-439a-9250-15165c6f10b0")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_AssociationEnd_elementSize";

    @objid ("7d1b1dea-5a61-4093-8791-9119abaae788")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE = "CommunicationMedia_AssociationEnd_packetT";

    @objid ("bd44f56f-4d55-4e48-b8a8-ff373646bf3d")
    public static final String COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE = "CommunicationMedia_AssociationEnd_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("add2e784-7514-4d7b-97b8-fecfab4f9939")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >> then instantiate a {@link CommunicationMediaAssociationEnd} proxy.
     * 
     * @return a {@link CommunicationMediaAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("71dfd7f6-f650-476d-bca6-357fac9cfdb0")
    public static CommunicationMediaAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaAssociationEnd.STEREOTYPE_NAME);
        return CommunicationMediaAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link CommunicationMediaAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("41764235-d3d2-48f1-be8c-1ced30461e34")
    public static CommunicationMediaAssociationEnd instantiate(final AssociationEnd obj) {
        return CommunicationMediaAssociationEnd.canInstantiate(obj) ? new CommunicationMediaAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << CommunicationMedia_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link CommunicationMediaAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d913929-98a4-4f80-9650-5383e15fa931")
    public static CommunicationMediaAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (CommunicationMediaAssociationEnd.canInstantiate(obj))
        	return new CommunicationMediaAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c22b85a1-cdb3-46cd-9dca-03a26e2c270d")
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
        CommunicationMediaAssociationEnd other = (CommunicationMediaAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("64176d3d-730b-4974-96d5-cf81275d8ad0")
    public List<String> getCommunicationMedia_AssociationEnd_blockT() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c47403a5-5d64-44c7-a967-d97d841814df")
    public List<String> getCommunicationMedia_AssociationEnd_capacity() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b9a1868-b8ad-4acc-9a3d-cf15bf1c1da3")
    public String getCommunicationMedia_AssociationEnd_elementSize() {
        return this.elt.getTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_AssociationEnd_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("45658367-69e7-4719-95fb-2f45a330ccc1")
    public List<String> getCommunicationMedia_AssociationEnd_packetT() {
        return this.elt.getTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d824f468-0050-4d4a-9e4e-218c948323de")
    public String getCommunicationMedia_AssociationEnd_transmMode() {
        return this.elt.getTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("7eaa9e93-7b8f-4507-82ab-344cca3bb928")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("e1dba4c8-7103-49d7-8f52-f6ecefd965b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("765426f2-b1c6-4c37-86b8-17d95f454775")
    public void setCommunicationMedia_AssociationEnd_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8bdf4157-7324-4d1d-becf-0f069a3b5a91")
    public void setCommunicationMedia_AssociationEnd_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd521550-45d3-4b84-abf4-5f673bac94e8")
    public void setCommunicationMedia_AssociationEnd_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_AssociationEnd_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c3daa37-5a6e-4861-91ff-03101e7781fe")
    public void setCommunicationMedia_AssociationEnd_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_AssociationEnd_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e58b67f8-0d9d-4abf-aa16-792248f12afc")
    public void setCommunicationMedia_AssociationEnd_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaAssociationEnd.MdaTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("0c2e29e6-83b7-44f5-93fd-13c5b20ed386")
    protected CommunicationMediaAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("a3567f59-c06a-42a3-9d4c-3492d39ba613")
    public static final class MdaTypes {
        @objid ("752a44bd-f36e-4173-8041-08915ed306fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ab453d5-a55c-4305-9759-d199c7ed5a10")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("31c74ea9-3f85-4564-9f91-03e433530e89")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT;

        @objid ("62170315-261a-4eb5-968b-f1025417aa46")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT;

        @objid ("0a963abf-4aad-400a-91b8-eb61138f27fb")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT;

        @objid ("882df758-8865-4bbc-8ceb-197da1d75246")
        public static TagType COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("4f09baca-8f42-4b73-a0f7-ed0f3a586027")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdc4ba31-62ba-4d77-b189-3aa4d24e22ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0bfd1695-454e-48f5-a917-b0af03b8b442")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0095c02c-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c033-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0095c03a-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982281-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00982288-0ccf-11df-8525-001302895b2b");
            COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0098228f-0ccf-11df-8525-001302895b2b");
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
