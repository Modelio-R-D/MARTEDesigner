/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << ClockResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c9a8b0c9-3cc3-4778-a031-fb69603bf900")
public class ClockResourceAssociation extends TimingResourceAssociation {
    @objid ("183ee3ae-d544-4bec-b16c-b0291311eda6")
    public static final String STEREOTYPE_NAME = "ClockResource_Association";

    /**
     * Tells whether a {@link ClockResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << ClockResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2ee82bb7-9b05-4350-a117-f4174f92ee28")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << ClockResource_Association >> then instantiate a {@link ClockResourceAssociation} proxy.
     * 
     * @return a {@link ClockResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("a397621b-53c2-4397-8422-81e9095d62a8")
    public static ClockResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAssociation.STEREOTYPE_NAME);
        return ClockResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceAssociation} proxy from a {@link Association} stereotyped << ClockResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ClockResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("3417b3a9-6a87-46f8-a01a-0aef7ef6101d")
    public static ClockResourceAssociation instantiate(final Association obj) {
        return ClockResourceAssociation.canInstantiate(obj) ? new ClockResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceAssociation} proxy from a {@link Association} stereotyped << ClockResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ClockResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a9022a8e-f70c-4af4-8fc7-5e6063bc8880")
    public static ClockResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ClockResourceAssociation.canInstantiate(obj))
        	return new ClockResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ClockResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2fbdd619-b09f-4dc1-80f6-cc1992b73068")
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
        ClockResourceAssociation other = (ClockResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("c3a1858d-bddc-4828-a195-962db494b0a2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("37a2c3f0-b903-4100-a8b9-b8f422061757")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("beb0ee56-1cf3-4f6f-8620-9c5ed9761897")
    protected ClockResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("ea05b396-190f-4f97-82dc-711f802854d8")
    public static final class MdaTypes {
        @objid ("161036a7-e12a-451d-8b35-dcc0647760aa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("851a488c-0871-4a26-b31f-50f9163bae51")
        private static Stereotype MDAASSOCDEP;

        @objid ("970693ed-b39d-42a2-a6d1-517c78786859")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("779b124a-4b20-4358-82f0-6cb0bd8dc51a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1d8f0cfb-0f43-11df-8c52-0014222a9f79");
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
