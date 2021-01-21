/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << ClockResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("74b29657-7adc-4dec-bc25-50f39d034c41")
public class ClockResourceAssociationEnd extends TimingResourceAssociationEnd {
    @objid ("2796a7f1-0e6e-4e00-bdd9-f08fb6b781ff")
    public static final String STEREOTYPE_NAME = "ClockResource_AssociationEnd";

    /**
     * Tells whether a {@link ClockResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << ClockResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d8dfb068-e69e-4745-b1a1-15ba4f575751")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << ClockResource_AssociationEnd >> then instantiate a {@link ClockResourceAssociationEnd} proxy.
     * 
     * @return a {@link ClockResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f56b78ca-493c-4851-ada0-fcf6a3644563")
    public static ClockResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAssociationEnd.STEREOTYPE_NAME);
        return ClockResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ClockResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ClockResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("d0963a65-d748-40e1-8bb4-a1b872aad817")
    public static ClockResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return ClockResourceAssociationEnd.canInstantiate(obj) ? new ClockResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ClockResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ClockResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cc50631c-8ee7-406a-92d8-4e2093d84740")
    public static ClockResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ClockResourceAssociationEnd.canInstantiate(obj))
        	return new ClockResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ClockResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b36324d3-eead-4744-8e8a-3a0139c22bbb")
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
        ClockResourceAssociationEnd other = (ClockResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("38d0d85c-0b9c-43bc-af82-97160d3eb328")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("7de6a8dc-a0ef-42a4-ac47-f1478f61c865")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ed6a0891-0e4f-4e91-a109-8e4a056db520")
    protected ClockResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("fb27cfb9-ed25-428c-8bc0-56547577bcff")
    public static final class MdaTypes {
        @objid ("083fb0ca-d750-4ee0-b7ae-dc54876f99b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7f1029e-afe3-4257-979c-81cae04e13db")
        private static Stereotype MDAASSOCDEP;

        @objid ("299b9cc3-5f71-4e9f-b3e2-d4b6e1b183be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a6c1fc9a-09ae-4576-a7c0-85d8d6c8ce3f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009f4972-0ccf-11df-8525-001302895b2b");
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
