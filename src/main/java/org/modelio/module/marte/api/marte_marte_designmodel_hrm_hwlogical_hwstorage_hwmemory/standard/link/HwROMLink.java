/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("d9c48b96-1008-43f3-9b24-1e5c0fffd0bf")
    public static final String STEREOTYPE_NAME = "HwROM_Link";

    @objid ("3dc4c6d4-d61d-472f-a774-cca85e2022a3")
    public static final String HWROM_LINK_ORGANIZATION_TAGTYPE = "HwROM_Link_organization";

    @objid ("c80a015f-1ceb-4dc6-81f9-e0d3140a30c3")
    public static final String HWROM_LINK_TYPE_TAGTYPE = "HwROM_Link_type";

    /**
     * Tells whether a {@link HwROMLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwROM_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("faba4824-de22-4cf4-bd38-4fb4a7525e21")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwROM_Link >> then instantiate a {@link HwROMLink} proxy.
     * 
     * @return a {@link HwROMLink} proxy on the created {@link Link}.
     */
    @objid ("4ea49c2b-4fc8-458b-bb3d-3469868ddc9f")
    public static HwROMLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMLink.STEREOTYPE_NAME);
        return HwROMLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwROMLink} proxy from a {@link Link} stereotyped << HwROM_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwROMLink} proxy or <i>null</i>.
     */
    @objid ("b4a1e0ce-d3ca-4790-aa45-652eb645b6da")
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
    @objid ("1bb72ee4-3406-469e-8107-cd87ef6df740")
    public static HwROMLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwROMLink.canInstantiate(obj))
        	return new HwROMLink(obj);
        else
        	throw new IllegalArgumentException("HwROMLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f4c0730-1876-48ca-b309-5b620b54c49b")
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
    @objid ("8c6816b2-a4c0-4716-bd41-7f4648088270")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0588acba-d1ce-47a3-8bd3-1bfc221ccf79")
    public String getHwROM_Link_organization() {
        return this.elt.getTagValue(HwROMLink.MdaTypes.HWROM_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("feda6125-9636-46d8-8835-9f11eb499936")
    public String getHwROM_Link_type() {
        return this.elt.getTagValue(HwROMLink.MdaTypes.HWROM_LINK_TYPE_TAGTYPE_ELT);
    }

    @objid ("be767cef-6e46-48f8-bd28-d9deba107f81")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9bea166-9286-4568-8df7-c5c5cdef547b")
    public void setHwROM_Link_organization(final String value) {
        this.elt.putTagValue(HwROMLink.MdaTypes.HWROM_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67fac323-be6b-4790-8e01-beb1c2ca675d")
    public void setHwROM_Link_type(final String value) {
        this.elt.putTagValue(HwROMLink.MdaTypes.HWROM_LINK_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("b9c3e886-56c2-4c5f-898e-b3242eb8a4e8")
    protected HwROMLink(final Link elt) {
        super(elt);
    }

    @objid ("f23f7d81-b11e-4409-9971-7141bb8c41ed")
    public static final class MdaTypes {
        @objid ("6ed1ea7e-a1b4-40a9-bfc2-087e182ea32e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5663bd06-6cfe-45ec-891d-abb6be6bb3a0")
        public static TagType HWROM_LINK_TYPE_TAGTYPE_ELT;

        @objid ("2070f403-340c-4ec9-ae00-6e46beba448f")
        public static TagType HWROM_LINK_ORGANIZATION_TAGTYPE_ELT;

        @objid ("61eb972f-b1c2-4d8c-8753-ba27edc02486")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c253e57-0f75-4044-b24c-702d2dd77703")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("113e69b4-0a98-481e-be26-6084e25ce985")
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
