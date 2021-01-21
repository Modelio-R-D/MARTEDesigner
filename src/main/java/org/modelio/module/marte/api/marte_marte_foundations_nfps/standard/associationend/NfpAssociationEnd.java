/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << Nfp_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("378218dc-6485-4a1a-957b-b138ddc7beec")
public class NfpAssociationEnd {
    @objid ("516c6aaa-32ef-4808-84cc-815b968f8b38")
    public static final String STEREOTYPE_NAME = "Nfp_AssociationEnd";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("c99724ca-7377-464b-ba90-0afbdb322ac4")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link NfpAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Nfp_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7c83aae0-57cc-4b2f-9f69-5edda1375de8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Nfp_AssociationEnd >> then instantiate a {@link NfpAssociationEnd} proxy.
     * 
     * @return a {@link NfpAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("50bccedb-864a-452f-ad93-349292b230fd")
    public static NfpAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpAssociationEnd.STEREOTYPE_NAME);
        return NfpAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link NfpAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Nfp_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link NfpAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("00454bc0-1d6d-4d48-95da-ffb8569a62d3")
    public static NfpAssociationEnd instantiate(final AssociationEnd obj) {
        return NfpAssociationEnd.canInstantiate(obj) ? new NfpAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Nfp_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link NfpAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("08e2df94-a0a5-4bb3-9e9f-ccb5f107c4df")
    public static NfpAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (NfpAssociationEnd.canInstantiate(obj))
        	return new NfpAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("NfpAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fafab8e8-cee5-4f59-9af6-4e781959c495")
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
        NfpAssociationEnd other = (NfpAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("4b69f7ec-ecbc-4b8e-bc61-f5bbb22f75d7")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("a662cf85-23b1-4fc4-b4fe-78929dd8c4ac")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f7b39cef-71a3-43c7-a77a-4dbd4733e0c8")
    protected NfpAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("b7e28d6f-9fc9-4557-bdc7-ead0e0f2ff05")
    public static final class MdaTypes {
        @objid ("dc344605-32b4-42ff-8a3a-f38b1fedd47a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ac34daf-eb50-4d40-9bd8-57c07658aa2c")
        private static Stereotype MDAASSOCDEP;

        @objid ("b2b673d0-3217-40e9-a45e-87ffa1718907")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86b02b76-85fd-4040-833e-a2119bd0e9e2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9490072-0cce-11df-8525-001302895b2b");
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
