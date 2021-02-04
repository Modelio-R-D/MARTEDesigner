/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwROM_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d1cb23ed-9c8a-41b0-97f4-a35bc9f14729")
public class HwROMLink extends HwMemoryLink {
    @objid ("5f8f553f-d79a-44a3-af42-4e01f8a99eeb")
    public static final String STEREOTYPE_NAME = "HwROM_Link";

    @objid ("a6496af1-177e-41cd-80be-b5a4674c103d")
    public static final String HWROM_LINK_ORGANIZATION_TAGTYPE = "HwROM_Link_organization";

    @objid ("cf0544f4-a7ae-4c81-aa68-65cac41d13a4")
    public static final String HWROM_LINK_TYPE_TAGTYPE = "HwROM_Link_type";

    /**
     * Tells whether a {@link HwROMLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwROM_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cf1f624b-0288-4dcf-a1a6-007f069a30f1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwROM_Link >> then instantiate a {@link HwROMLink} proxy.
     * 
     * @return a {@link HwROMLink} proxy on the created {@link Link}.
     */
    @objid ("6f870c82-8b07-4944-90f6-97c6d9a3eea7")
    public static HwROMLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMLink.STEREOTYPE_NAME);
        return HwROMLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwROMLink} proxy from a {@link Link} stereotyped << HwROM_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwROMLink} proxy or <i>null</i>.
     */
    @objid ("0b904f07-4393-49ea-82d0-fcc90e27b146")
    public static HwROMLink instantiate(final Link obj) {
        return HwROMLink.canInstantiate(obj) ? new HwROMLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMLink} proxy from a {@link Link} stereotyped << HwROM_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwROMLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ca53f2de-0f8c-44b2-8b12-dd0b3b3a4a02")
    public static HwROMLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwROMLink.canInstantiate(obj))
        	return new HwROMLink(obj);
        else
        	throw new IllegalArgumentException("HwROMLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6dcd5fab-5212-454e-b383-3a5f46cc0d28")
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
        HwROMLink other = (HwROMLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("90bb8e29-ab92-4bac-8f8d-8acfeeb0a9e7")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7dd8e42a-57f2-4610-b980-d10bbef58676")
    public String getHwROM_Link_organization() {
        return this.elt.getTagValue(HwROMLink.MdaTypes.HWROM_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd8802c1-72ff-48db-b502-1334764bb7a6")
    public String getHwROM_Link_type() {
        return this.elt.getTagValue(HwROMLink.MdaTypes.HWROM_LINK_TYPE_TAGTYPE_ELT);
    }

    @objid ("9dfba50c-75d6-4977-bb57-3c66ec115a99")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("861f2c47-1b84-4311-bcda-5a4a754e59b8")
    public void setHwROM_Link_organization(final String value) {
        this.elt.putTagValue(HwROMLink.MdaTypes.HWROM_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1a7e43f-58d3-4680-b6bf-85f36c818528")
    public void setHwROM_Link_type(final String value) {
        this.elt.putTagValue(HwROMLink.MdaTypes.HWROM_LINK_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("b8d48a76-760d-4d8c-9e35-ae0afead6412")
    protected HwROMLink(final Link elt) {
        super(elt);
    }

    @objid ("f23f7d81-b11e-4409-9971-7141bb8c41ed")
    public static final class MdaTypes {
        @objid ("f520b6c5-4473-41d9-9daf-27256b0e4a01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d464f721-4821-4476-85f3-165c2c81f7cc")
        public static TagType HWROM_LINK_TYPE_TAGTYPE_ELT;

        @objid ("e36212ae-7ffd-4e99-814e-a4cc9d8a61b5")
        public static TagType HWROM_LINK_ORGANIZATION_TAGTYPE_ELT;

        @objid ("f236867c-6d90-4d64-818a-5758d554bec8")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c9c9816-3015-4558-93d3-c1789f581659")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f5168e47-ea2c-4f0e-9a6c-0443077be684")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01678c5e-0ccf-11df-8525-001302895b2b");
            HWROM_LINK_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeb2-0ccf-11df-8525-001302895b2b");
            HWROM_LINK_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeb9-0ccf-11df-8525-001302895b2b");
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
