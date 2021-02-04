/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Var_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c3fbc2ed-5053-4def-93be-2cfcd54b8a40")
public class VarAssociationEnd {
    @objid ("5959199b-5918-4bd2-9a04-11913804fdd1")
    public static final String STEREOTYPE_NAME = "Var_AssociationEnd";

    @objid ("69b5b08d-e760-4ea4-a377-cb061738e0f5")
    public static final String VAR_ASSOCIATIONEND_DIR_TAGTYPE = "Var_AssociationEnd_dir";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("ddee880d-2df8-4aad-b9e8-90f07c10a569")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link VarAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Var_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c3b82f33-9af5-4b3e-bcc5-9f942bb54e43")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, VarAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Var_AssociationEnd >> then instantiate a {@link VarAssociationEnd} proxy.
     * 
     * @return a {@link VarAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("c66da6d2-db17-4a52-8e04-c8a286456907")
    public static VarAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, VarAssociationEnd.STEREOTYPE_NAME);
        return VarAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link VarAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Var_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link VarAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("3aa6e027-9f48-4acf-953c-71d5ca7bc6fc")
    public static VarAssociationEnd instantiate(final AssociationEnd obj) {
        return VarAssociationEnd.canInstantiate(obj) ? new VarAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VarAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Var_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link VarAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cdf48417-7f3d-4563-b9dd-5fd1ddea0b85")
    public static VarAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (VarAssociationEnd.canInstantiate(obj))
        	return new VarAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("VarAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6a26f01-3f3a-40fe-b1d3-ca00014ab27a")
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
        VarAssociationEnd other = (VarAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("685c1cd7-9ad7-496f-8733-d7fda56e3980")
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Var_AssociationEnd_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cfd048ae-ac1a-423a-8aa8-46f5f0bf83de")
    public String getVar_AssociationEnd_dir() {
        return this.elt.getTagValue(VarAssociationEnd.MdaTypes.VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT);
    }

    @objid ("4c424d18-1510-4c0e-8a76-da8677349188")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Var_AssociationEnd_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3eee5bd9-4a04-4a72-81aa-54f87903d820")
    public void setVar_AssociationEnd_dir(final String value) {
        this.elt.putTagValue(VarAssociationEnd.MdaTypes.VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT, value);
    }

    @objid ("5cc65858-81ee-442a-bd88-5687ee4b6cd9")
    protected VarAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("99530e83-5100-4380-8f32-c1da6f565379")
    public static final class MdaTypes {
        @objid ("058cd3f8-e903-4823-805a-dec9ebf935da")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a8c65653-85f0-4cd9-a5c9-de22dfefb9cd")
        public static TagType VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT;

        @objid ("9d0dcef5-b3d5-4636-99c0-c5f816657064")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ba9841a-9a2e-44e1-a281-60aa6bca643c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b9973d9-2868-4c96-881a-ae63164a68a7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03dcf103-0ccf-11df-8525-001302895b2b");
            VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03dcf106-0ccf-11df-8525-001302895b2b");
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
