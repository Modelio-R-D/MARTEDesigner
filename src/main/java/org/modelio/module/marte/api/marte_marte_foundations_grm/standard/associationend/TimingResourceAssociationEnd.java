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
 * Proxy class to handle a {@link AssociationEnd} with << TimingResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5d6565a-cf78-4b72-bb7d-22126b00823c")
public class TimingResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("8930a029-6c6f-420a-ad19-534e47926f9c")
    public static final String STEREOTYPE_NAME = "TimingResource_AssociationEnd";

    /**
     * Tells whether a {@link TimingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TimingResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fa14fd34-1bbd-4ab6-9192-43cb4841a16a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TimingResource_AssociationEnd >> then instantiate a {@link TimingResourceAssociationEnd} proxy.
     * 
     * @return a {@link TimingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("4334e8ee-d525-4bfe-bf99-d35dba887499")
    public static TimingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAssociationEnd.STEREOTYPE_NAME);
        return TimingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << TimingResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link TimingResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("0db01d97-170f-40b9-ac89-b6a92a70e74a")
    public static TimingResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return TimingResourceAssociationEnd.canInstantiate(obj) ? new TimingResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << TimingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link TimingResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d832b142-a400-4945-9cbe-9638bee79172")
    public static TimingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TimingResourceAssociationEnd.canInstantiate(obj))
        	return new TimingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("TimingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d5f18a8-0fe9-4c24-9c77-94aa8d2e40a6")
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
        TimingResourceAssociationEnd other = (TimingResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("4e517c4e-d489-45a5-9391-50e51c06f03c")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("c8988f67-70d6-40dd-b46a-0063a6dfea07")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a78074c7-8b2c-44d9-a1b2-fde3e4601202")
    protected TimingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("f972b130-f931-4175-aa53-13bf7a0f6393")
    public static final class MdaTypes {
        @objid ("ce16d11b-abef-4e7d-bec6-3f6acc29ab18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a79798eb-7ac2-427b-b7c8-80f6f36c5c64")
        private static Stereotype MDAASSOCDEP;

        @objid ("310917c6-f998-41d1-bc80-45184072c7f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c2db1073-af5f-4812-8243-4047b13a0e95")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009ce720-0ccf-11df-8525-001302895b2b");
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
