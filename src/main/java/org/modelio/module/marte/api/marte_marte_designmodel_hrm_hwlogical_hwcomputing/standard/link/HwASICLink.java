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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwASIC_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("72c49851-2e72-4757-adf5-28a6a9c5794a")
public class HwASICLink extends HwComputingResourceLink {
    @objid ("51f0e86c-cb0f-4d70-85d8-a4860c16619e")
    public static final String STEREOTYPE_NAME = "HwASIC_Link";

    /**
     * Tells whether a {@link HwASICLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwASIC_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("66b345a1-83e3-41a7-ac10-ec8dc9957520")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwASIC_Link >> then instantiate a {@link HwASICLink} proxy.
     * 
     * @return a {@link HwASICLink} proxy on the created {@link Link}.
     */
    @objid ("6f33c589-ad5a-4a72-a430-05b9673f325a")
    public static HwASICLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICLink.STEREOTYPE_NAME);
        return HwASICLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwASICLink} proxy from a {@link Link} stereotyped << HwASIC_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwASICLink} proxy or <i>null</i>.
     */
    @objid ("022d29ef-80a8-46a4-abbf-e6b78ca582dc")
    public static HwASICLink instantiate(final Link obj) {
        return HwASICLink.canInstantiate(obj) ? new HwASICLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICLink} proxy from a {@link Link} stereotyped << HwASIC_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwASICLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d985f194-8c1a-499f-8a21-1fe7708b1c23")
    public static HwASICLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwASICLink.canInstantiate(obj))
        	return new HwASICLink(obj);
        else
        	throw new IllegalArgumentException("HwASICLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c90fb089-6421-4913-9328-64adef5f5dda")
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
        HwASICLink other = (HwASICLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("90349426-c252-46bf-8ab9-17702b475fa8")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("97a2d569-6e60-4291-9aa6-97bd3bf4b251")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("71f2548a-6b49-42ee-96cd-5f739f3e7cb7")
    protected HwASICLink(final Link elt) {
        super(elt);
    }

    @objid ("5a7b05b5-165b-4d14-87ae-5a28e5979542")
    public static final class MdaTypes {
        @objid ("7b110e3f-f2eb-4197-a211-711d54cb3ebb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e92ab916-1da3-451b-843c-d4cbd72f754c")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6346215-49d8-4cc8-a2ff-df258a9a2042")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c2e59db3-af62-4451-bd89-401e641795df")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00e93165-0ccf-11df-8525-001302895b2b");
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
