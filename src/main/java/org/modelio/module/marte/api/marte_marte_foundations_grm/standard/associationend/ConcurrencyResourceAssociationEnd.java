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
 * Proxy class to handle a {@link AssociationEnd} with << ConcurrencyResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cf044487-1fe1-44aa-b094-64c3f960a15b")
public class ConcurrencyResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("536ec8e0-653e-4500-8d94-b0dbe027a418")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_AssociationEnd";

    /**
     * Tells whether a {@link ConcurrencyResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << ConcurrencyResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3f246f77-6fe1-48e2-b2fc-1e0d90a57f67")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << ConcurrencyResource_AssociationEnd >> then instantiate a {@link ConcurrencyResourceAssociationEnd} proxy.
     * 
     * @return a {@link ConcurrencyResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("b72fa65d-6468-433b-8568-883db4c668b3")
    public static ConcurrencyResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceAssociationEnd.STEREOTYPE_NAME);
        return ConcurrencyResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ConcurrencyResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ConcurrencyResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("eaca0430-3bc8-4d97-8e69-79be924bb8ab")
    public static ConcurrencyResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return ConcurrencyResourceAssociationEnd.canInstantiate(obj) ? new ConcurrencyResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ConcurrencyResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ConcurrencyResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bd99ad89-4aad-4bf1-91ef-7ae9c9c7034e")
    public static ConcurrencyResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ConcurrencyResourceAssociationEnd.canInstantiate(obj))
        	return new ConcurrencyResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8d00b504-8670-4a8b-a289-07a8c28bc6fa")
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
        ConcurrencyResourceAssociationEnd other = (ConcurrencyResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("d05e3ce8-b80d-450a-9775-24805ce64591")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("33e07a06-9acc-47ce-ae2e-e990c8e322e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e76529c2-bc6e-49c1-a0e2-677853ed650d")
    protected ConcurrencyResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("7cea912c-dad7-4425-afe2-243b2d0c02d7")
    public static final class MdaTypes {
        @objid ("0e0fb896-93c3-4e12-a251-1cda7268d187")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9f5430e-0875-4450-95a6-b1a57a7a2670")
        private static Stereotype MDAASSOCDEP;

        @objid ("23180c36-e5b8-49fd-81c2-911128fa0c0a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b872230-4273-4108-9a04-302504a847cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fff86706-0cce-11df-8525-001302895b2b");
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
