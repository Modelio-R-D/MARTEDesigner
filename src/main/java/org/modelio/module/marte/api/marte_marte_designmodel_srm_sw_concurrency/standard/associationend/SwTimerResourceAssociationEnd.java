/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("a1d790ae-f543-4273-95f5-7ab13e2c5cb1")
    public static final String STEREOTYPE_NAME = "SwTimerResource_AssociationEnd";

    /**
     * Tells whether a {@link SwTimerResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwTimerResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("62a06596-b4ec-40f2-9328-9a088ab07977")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwTimerResource_AssociationEnd >> then instantiate a {@link SwTimerResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwTimerResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("635d8864-11a5-43a7-9e8a-deb33eeebbff")
    public static SwTimerResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociationEnd.STEREOTYPE_NAME);
        return SwTimerResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwTimerResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwTimerResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("d04daa63-72de-45a2-87b8-6a9b91372a6c")
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
    @objid ("5aba4bc7-5e83-4975-8c1f-2950994486aa")
    public static SwTimerResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwTimerResourceAssociationEnd.canInstantiate(obj))
        	return new SwTimerResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b86e3695-2970-4f97-9f0a-9380fa77b0a3")
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
    @objid ("2ffa30a8-6f2a-4fe8-bcb6-f02776a3b207")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("b251b178-f5ec-4627-afd4-0c45146f853c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f630d271-e5c0-4af8-9112-e5f33985adcc")
    protected SwTimerResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("7719b4fe-0926-4adb-99aa-bcdebeccaa05")
    public static final class MdaTypes {
        @objid ("08cd5a08-2388-44ca-8e71-7e8380bbf4c6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4f32e4d5-9f0f-457d-81a4-1815b69bb8c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd75f9f9-1090-4770-b4f6-c0b542d15d52")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0b1185bc-1e99-42dc-a5a6-e37c20fac7b6")
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
