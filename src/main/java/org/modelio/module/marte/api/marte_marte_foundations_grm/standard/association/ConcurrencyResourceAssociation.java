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
 * Proxy class to handle a {@link Association} with << ConcurrencyResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dc758377-590b-46a3-b7a0-0c7205f9e069")
public class ConcurrencyResourceAssociation extends ResourceAssociation {
    @objid ("ad57c85b-a213-4144-a4b1-721c7da1f171")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Association";

    /**
     * Tells whether a {@link ConcurrencyResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << ConcurrencyResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("184796c7-faec-4b36-a04c-1999fd379dec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << ConcurrencyResource_Association >> then instantiate a {@link ConcurrencyResourceAssociation} proxy.
     * 
     * @return a {@link ConcurrencyResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("af32447e-af3e-4d4f-afc5-378aab511903")
    public static ConcurrencyResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceAssociation.STEREOTYPE_NAME);
        return ConcurrencyResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceAssociation} proxy from a {@link Association} stereotyped << ConcurrencyResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ConcurrencyResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("02c01d20-f61d-45bf-9025-12b689c62992")
    public static ConcurrencyResourceAssociation instantiate(final Association obj) {
        return ConcurrencyResourceAssociation.canInstantiate(obj) ? new ConcurrencyResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceAssociation} proxy from a {@link Association} stereotyped << ConcurrencyResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ConcurrencyResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("70bc5763-bf36-4288-8e14-5168f12b8220")
    public static ConcurrencyResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ConcurrencyResourceAssociation.canInstantiate(obj))
        	return new ConcurrencyResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20b67363-4aa3-41c1-8b97-a116ab5ae456")
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
        ConcurrencyResourceAssociation other = (ConcurrencyResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("6f7db274-87ae-4641-8aa6-00a4cbf682eb")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("d7ad99fe-df2b-44cf-b5d1-f2ccf1c6b3e5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("467db26e-20ab-4ee6-ac70-45520f84eb78")
    protected ConcurrencyResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("7904ab62-2dbe-4c76-b60c-1149308ca6c0")
    public static final class MdaTypes {
        @objid ("66983f41-6d23-4af3-b8e8-0a6c6e318ab6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11ed15af-98bc-4fa6-a431-7908193495a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("48f481f6-7869-483f-a391-afd9f67341b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("49d4cd71-219f-4857-8bde-350d304ce3e0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc46708d-0f3e-11df-8c52-0014222a9f79");
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
