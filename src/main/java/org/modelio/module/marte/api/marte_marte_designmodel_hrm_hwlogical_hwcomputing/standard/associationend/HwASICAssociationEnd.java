/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << HwASIC_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("64081c6c-4ea3-4c67-9204-7d130782620b")
public class HwASICAssociationEnd extends HwComputingResourceAssociationEnd {
    @objid ("791b6d3d-0b8b-44fc-a6a3-3c507ec3a22c")
    public static final String STEREOTYPE_NAME = "HwASIC_AssociationEnd";

    /**
     * Tells whether a {@link HwASICAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwASIC_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6bb0a30e-7b99-474f-ac0d-9844eac84cfc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwASIC_AssociationEnd >> then instantiate a {@link HwASICAssociationEnd} proxy.
     * 
     * @return a {@link HwASICAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("65319124-aef4-4559-83b2-4fbb14d3a3f4")
    public static HwASICAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAssociationEnd.STEREOTYPE_NAME);
        return HwASICAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwASICAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwASIC_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwASICAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("830f0d7e-a998-429a-b027-98ddc79a5e77")
    public static HwASICAssociationEnd instantiate(final AssociationEnd obj) {
        return HwASICAssociationEnd.canInstantiate(obj) ? new HwASICAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwASIC_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwASICAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("58099448-dd5d-4533-aee6-26e27fa93725")
    public static HwASICAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwASICAssociationEnd.canInstantiate(obj))
        	return new HwASICAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwASICAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6885f47a-2fbd-4790-8220-6a16c4d5e36b")
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
        HwASICAssociationEnd other = (HwASICAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("aa0a8710-643a-41b0-ab28-51bcd1012870")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("8616a40d-7bd3-4049-91b8-0009fa5d0948")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("be6c9e2d-e52f-492d-be27-9b2b4950309f")
    protected HwASICAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("e28bbf1e-4b6f-48e6-a4ad-44d1fd1601b5")
    public static final class MdaTypes {
        @objid ("c591a37c-dc5b-460d-9268-e8042fbce441")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e315bc4e-1847-43e0-96d7-3ab73d836ea3")
        private static Stereotype MDAASSOCDEP;

        @objid ("f111ddec-85fb-4534-8d2e-937654367abe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("277c9208-1328-4716-bb87-cf1bd5e0c128")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00e93161-0ccf-11df-8525-001302895b2b");
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
