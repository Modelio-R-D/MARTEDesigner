/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Association} with << SecondaryScheduler_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6002bb11-3fa1-41cc-9e05-8d6079317956")
public class SecondarySchedulerAssociation extends SchedulerAssociation {
    @objid ("5ae7bae6-008b-4f3f-abe9-3827a9b10d5f")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Association";

    @objid ("4d5e3d27-9dca-4d28-9664-724444134fff")
    public static final String SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Association_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SecondaryScheduler_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ea1966ad-204e-4a29-a08a-1be94c73b95e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SecondaryScheduler_Association >> then instantiate a {@link SecondarySchedulerAssociation} proxy.
     * 
     * @return a {@link SecondarySchedulerAssociation} proxy on the created {@link Association}.
     */
    @objid ("bb34c00c-f07f-4b98-8d08-c4010df75690")
    public static SecondarySchedulerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAssociation.STEREOTYPE_NAME);
        return SecondarySchedulerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAssociation} proxy from a {@link Association} stereotyped << SecondaryScheduler_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SecondarySchedulerAssociation} proxy or <i>null</i>.
     */
    @objid ("4baf95a8-2af1-4e6d-857b-e1c1921bd304")
    public static SecondarySchedulerAssociation instantiate(final Association obj) {
        return SecondarySchedulerAssociation.canInstantiate(obj) ? new SecondarySchedulerAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAssociation} proxy from a {@link Association} stereotyped << SecondaryScheduler_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SecondarySchedulerAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("010997f2-54e5-4075-85a7-df927fef9efd")
    public static SecondarySchedulerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SecondarySchedulerAssociation.canInstantiate(obj))
        	return new SecondarySchedulerAssociation(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d76947bb-e9c2-4518-bdf5-2b006cd96803")
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
        SecondarySchedulerAssociation other = (SecondarySchedulerAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("5e184f19-2492-41a9-8fae-d72c20538a57")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Association_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9f868a69-e82d-4b6d-a83f-5d520d372ae7")
    public List<String> getSecondaryScheduler_Association_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerAssociation.MdaTypes.SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("b9fd64bf-53b3-49d3-ae5b-8b74a40069f1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Association_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c69cc13-94df-42e9-9af9-7703b5407cbf")
    public void setSecondaryScheduler_Association_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerAssociation.MdaTypes.SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("7943de72-d7ef-4d24-9e09-2a645dc09dc1")
    protected SecondarySchedulerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("0480f82d-b102-4d34-ba85-a1bc759bef1c")
    public static final class MdaTypes {
        @objid ("9b6a4a92-8001-4cb2-b33d-785bc414f1c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cef72b23-a7d7-4ccb-8540-56f14dc259b9")
        public static TagType SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("70379328-6997-44bf-8a2d-ba64a3e30455")
        private static Stereotype MDAASSOCDEP;

        @objid ("25766148-c2e7-40de-9232-1ea567c4f03a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f801222-6158-4736-8b94-15035c880e14")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "985e2244-0f41-11df-8c52-0014222a9f79");
            SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7dbdb783-16fa-11df-b92a-0014222a9f79");
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
