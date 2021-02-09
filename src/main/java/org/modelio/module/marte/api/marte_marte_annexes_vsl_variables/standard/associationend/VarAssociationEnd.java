/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.associationend;

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
public class VarAssociationEnd {
    public static final String STEREOTYPE_NAME = "Var_AssociationEnd";

    public static final String VAR_ASSOCIATIONEND_DIR_TAGTYPE = "Var_AssociationEnd_dir";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link VarAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Var_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, VarAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Var_AssociationEnd >> then instantiate a {@link VarAssociationEnd} proxy.
     * 
     * @return a {@link VarAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
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
    public static VarAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (VarAssociationEnd.canInstantiate(obj))
        	return new VarAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("VarAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        VarAssociationEnd other = (VarAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Var_AssociationEnd_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getVar_AssociationEnd_dir() {
        return this.elt.getTagValue(VarAssociationEnd.MdaTypes.VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Var_AssociationEnd_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setVar_AssociationEnd_dir(final String value) {
        this.elt.putTagValue(VarAssociationEnd.MdaTypes.VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT, value);
    }

    protected VarAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
