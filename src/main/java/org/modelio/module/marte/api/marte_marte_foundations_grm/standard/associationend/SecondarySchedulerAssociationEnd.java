/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SecondaryScheduler_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("38a8e62c-1598-4363-ba8a-ddf61bd9ea38")
public class SecondarySchedulerAssociationEnd extends SchedulerAssociationEnd {
    @objid ("cb99b6bd-9ca9-48af-94af-1a485454ce87")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_AssociationEnd";

    @objid ("d87bbc40-9b9a-4cde-a6da-74e9acb3964d")
    public static final String SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_AssociationEnd_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f756661a-2c9c-40ed-926a-bbea3eac0894")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >> then instantiate a {@link SecondarySchedulerAssociationEnd} proxy.
     * 
     * @return a {@link SecondarySchedulerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("ada6a523-dd8a-4f5e-961f-22da0610088a")
    public static SecondarySchedulerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAssociationEnd.STEREOTYPE_NAME);
        return SecondarySchedulerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SecondarySchedulerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("336938b2-cdb2-4922-b4f1-2a12d556ad57")
    public static SecondarySchedulerAssociationEnd instantiate(final AssociationEnd obj) {
        return SecondarySchedulerAssociationEnd.canInstantiate(obj) ? new SecondarySchedulerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SecondaryScheduler_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SecondarySchedulerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8601a1b4-8e95-4193-81cd-274a230ba152")
    public static SecondarySchedulerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SecondarySchedulerAssociationEnd.canInstantiate(obj))
        	return new SecondarySchedulerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("82ee85a4-2fa7-4a75-98df-41ee4d158254")
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
        SecondarySchedulerAssociationEnd other = (SecondarySchedulerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("4570bd16-137d-4127-8b93-5ce3762a2d3c")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_AssociationEnd_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("afb2e0f5-4d6b-4d05-b831-f9e27c088435")
    public List<String> getSecondaryScheduler_AssociationEnd_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerAssociationEnd.MdaTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("d66fed65-32c4-4863-a2bb-ce3c9dc08615")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_AssociationEnd_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1d15cd3-b37d-4d27-9687-28986ecfa2b0")
    public void setSecondaryScheduler_AssociationEnd_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerAssociationEnd.MdaTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("e0177270-3872-405a-a4f5-acb6722a777d")
    protected SecondarySchedulerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("a552d079-f750-4bae-be51-ad8e4bb3d51d")
    public static final class MdaTypes {
        @objid ("4630268c-b43d-484a-9a6f-096563227e1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45f6363e-4ae1-49c6-bdc4-517acadabe96")
        public static TagType SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("32cbcd0a-be02-42b0-a3bb-ef2a1d8f4d1e")
        private static Stereotype MDAASSOCDEP;

        @objid ("306150e1-7824-4665-a12e-b55902078ee6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("39b4b4bc-425a-4581-98c8-51b74925e143")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002cda27-0ccf-11df-8525-001302895b2b");
            SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "60e42b55-158d-11df-b173-0014222a9f79");
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
