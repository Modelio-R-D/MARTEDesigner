/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.TimerResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwTimerResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("82dd1055-639c-4563-9e81-8e85e547b773")
public class SwTimerResourceAssociationEnd extends TimerResourceAssociationEnd {
    @objid ("5bc19810-5c18-4cab-92c0-a251c0d36b0d")
    public static final String STEREOTYPE_NAME = "SwTimerResource_AssociationEnd";

    /**
     * Tells whether a {@link SwTimerResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwTimerResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("70cc0af0-2e3c-4d02-9b1b-6eb567a5575f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwTimerResource_AssociationEnd >> then instantiate a {@link SwTimerResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwTimerResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("7a5ded71-9512-47a7-8827-bb1ce7d751cd")
    public static SwTimerResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociationEnd.STEREOTYPE_NAME);
        return SwTimerResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwTimerResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwTimerResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("68e22b04-429e-49d4-b4da-012c5dc158cb")
    public static SwTimerResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwTimerResourceAssociationEnd.canInstantiate(obj) ? new SwTimerResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwTimerResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwTimerResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9b3a54bd-78cb-44d8-a26e-a8f350355710")
    public static SwTimerResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwTimerResourceAssociationEnd.canInstantiate(obj))
        	return new SwTimerResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("28900d8f-8fd3-4336-9eb1-b648e73da86f")
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
        SwTimerResourceAssociationEnd other = (SwTimerResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("a50d78e4-9227-4dfa-87ba-9a117dbf9620")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("dde01e26-3f14-409a-a076-b0bd063dc15c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("79ddea33-8eeb-4457-8798-65c23857b55b")
    protected SwTimerResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("7719b4fe-0926-4adb-99aa-bcdebeccaa05")
    public static final class MdaTypes {
        @objid ("ed89f839-80cf-459c-b19f-cc2b642001bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b02b6e61-e77d-4697-b33b-3cd818b00e5f")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d7c4f4a-6bb9-41ab-9aba-a75e8b9b15ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e889eac-6789-4494-8a31-2a9e00f77a73")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01dec05f-0ccf-11df-8525-001302895b2b");
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
