/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("3ae357af-740e-41df-a351-67c4773e1a90")
    public static final String STEREOTYPE_NAME = "Var_AssociationEnd";

    @objid ("21de50f2-6b22-4153-8964-e1195924770f")
    public static final String VAR_ASSOCIATIONEND_DIR_TAGTYPE = "Var_AssociationEnd_dir";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("882f7669-642b-4d1d-b39b-532e5de8b90b")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link VarAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Var_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("eeba856d-7925-461b-a650-c04c71d3f9b5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, VarAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Var_AssociationEnd >> then instantiate a {@link VarAssociationEnd} proxy.
     * 
     * @return a {@link VarAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("898100d8-32b7-4420-9bba-b658b50c461c")
    public static VarAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, VarAssociationEnd.STEREOTYPE_NAME);
        return VarAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link VarAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Var_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link VarAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("046f15e7-581f-41d7-a886-ce77ea17da22")
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
    @objid ("ff88c027-059c-4513-92ba-b993145f8905")
    public static VarAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (VarAssociationEnd.canInstantiate(obj))
        	return new VarAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("VarAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1114e993-fe4f-473b-9735-e8375b9db89f")
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
    @objid ("d4e042e8-a3d2-46a5-acc7-8f1de25da2e6")
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Var_AssociationEnd_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("481c94c3-b147-4df5-acd9-0ddd8d327617")
    public String getVar_AssociationEnd_dir() {
        return this.elt.getTagValue(VarAssociationEnd.MdaTypes.VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT);
    }

    @objid ("5040b728-444d-4d79-b38e-c4e625bcf5a2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Var_AssociationEnd_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cf9409e-6ceb-4033-9aae-8b199d2973be")
    public void setVar_AssociationEnd_dir(final String value) {
        this.elt.putTagValue(VarAssociationEnd.MdaTypes.VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT, value);
    }

    @objid ("86dc4f1e-3895-4753-86dd-3706d8b2f607")
    protected VarAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("99530e83-5100-4380-8f32-c1da6f565379")
    public static final class MdaTypes {
        @objid ("279bbe19-13b1-4cf8-9ef8-fc35d6c63e08")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("18d9315b-952b-41c1-a7f9-0e2de656cbd4")
        public static TagType VAR_ASSOCIATIONEND_DIR_TAGTYPE_ELT;

        @objid ("f0da382f-129d-4624-ae67-dee9df06f7b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("1da14d5c-871c-4405-bd2b-92b3bd540d77")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b679822a-320a-49d9-bab6-fd4c9b1eeb66")
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
