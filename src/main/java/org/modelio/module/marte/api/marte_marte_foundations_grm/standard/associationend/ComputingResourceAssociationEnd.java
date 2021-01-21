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
 * Proxy class to handle a {@link AssociationEnd} with << ComputingResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3c6d26d6-10f2-4f80-8fb9-26b4ca480bbc")
public class ComputingResourceAssociationEnd extends ProcessingResourceAssociationEnd {
    @objid ("83d900b8-7450-4b08-8cac-6ab1d84c431e")
    public static final String STEREOTYPE_NAME = "ComputingResource_AssociationEnd";

    /**
     * Tells whether a {@link ComputingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << ComputingResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a46e8c58-9e38-436f-aefe-8104bf5debe7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << ComputingResource_AssociationEnd >> then instantiate a {@link ComputingResourceAssociationEnd} proxy.
     * 
     * @return a {@link ComputingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("47d772aa-ea8d-4d02-a2bf-c5609457418c")
    public static ComputingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceAssociationEnd.STEREOTYPE_NAME);
        return ComputingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ComputingResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ComputingResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("5245f312-ba09-4ab9-a4c6-612672c1f515")
    public static ComputingResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return ComputingResourceAssociationEnd.canInstantiate(obj) ? new ComputingResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << ComputingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ComputingResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a2eafe2c-cb23-493e-95d8-ca591795f984")
    public static ComputingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ComputingResourceAssociationEnd.canInstantiate(obj))
        	return new ComputingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ba29cab6-59d1-4bb6-a511-5ba7938fb30b")
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
        ComputingResourceAssociationEnd other = (ComputingResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("a92a4cd0-674f-427c-a4b4-6163e235dcfa")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("218ade69-28f0-474d-82aa-34e29c68fc1d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e631c377-8377-44fd-af54-a2a29cbfe9d5")
    protected ComputingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("dede802c-29e9-4348-96c9-03dd5b17f919")
    public static final class MdaTypes {
        @objid ("aaeb8564-36e8-4374-b14e-e8c964c58d70")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0a5ed29b-42fb-4f4a-8277-9f569b834931")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a6db22f-0c87-4ac1-9765-a1f2713357b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c34af4b0-5944-41fe-aad2-0fc9c2958baf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84cf-0ccf-11df-8525-001302895b2b");
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
