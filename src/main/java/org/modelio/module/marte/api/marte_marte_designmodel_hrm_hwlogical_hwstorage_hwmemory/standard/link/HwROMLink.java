/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwROMLink extends HwMemoryLink {
    public static final String STEREOTYPE_NAME = "HwROM_Link";

    public static final String HWROM_LINK_ORGANIZATION_TAGTYPE = "HwROM_Link_organization";

    public static final String HWROM_LINK_TYPE_TAGTYPE = "HwROM_Link_type";

    /**
     * Tells whether a {@link HwROMLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwROM_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwROM_Link >> then instantiate a {@link HwROMLink} proxy.
     * 
     * @return a {@link HwROMLink} proxy on the created {@link Link}.
     */
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
    public static HwROMLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwROMLink.canInstantiate(obj))
        	return new HwROMLink(obj);
        else
        	throw new IllegalArgumentException("HwROMLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwROM_Link_organization() {
        return this.elt.getTagValue(HwROMLink.MdaTypes.HWROM_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwROM_Link_type() {
        return this.elt.getTagValue(HwROMLink.MdaTypes.HWROM_LINK_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwROM_Link_organization(final String value) {
        this.elt.putTagValue(HwROMLink.MdaTypes.HWROM_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwROM_Link_type(final String value) {
        this.elt.putTagValue(HwROMLink.MdaTypes.HWROM_LINK_TYPE_TAGTYPE_ELT, value);
    }

    protected HwROMLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWROM_LINK_TYPE_TAGTYPE_ELT;

        public static TagType HWROM_LINK_ORGANIZATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
