/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SecondaryScheduler_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0568500c-7d6c-4f9c-91ad-ec4654186350")
public class SecondarySchedulerAttribute extends SchedulerAttribute {
    @objid ("13a4188e-5381-4a55-8462-96944c2dc5db")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Attribute";

    @objid ("ca46bab0-eac4-4320-a060-1ae7464757c2")
    public static final String SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Attribute_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SecondaryScheduler_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("014d82af-0613-4a6a-8013-33124ac6df16")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SecondaryScheduler_Attribute >> then instantiate a {@link SecondarySchedulerAttribute} proxy.
     * 
     * @return a {@link SecondarySchedulerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("7a98c763-bada-4dff-b05a-78212718e311")
    public static SecondarySchedulerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerAttribute.STEREOTYPE_NAME);
        return SecondarySchedulerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAttribute} proxy from a {@link Attribute} stereotyped << SecondaryScheduler_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SecondarySchedulerAttribute} proxy or <i>null</i>.
     */
    @objid ("a4790f9e-71ed-4606-8a5f-32e2660448c8")
    public static SecondarySchedulerAttribute instantiate(final Attribute obj) {
        return SecondarySchedulerAttribute.canInstantiate(obj) ? new SecondarySchedulerAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerAttribute} proxy from a {@link Attribute} stereotyped << SecondaryScheduler_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SecondarySchedulerAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("40bdceb9-2694-43a1-8b5c-90e3badde9e2")
    public static SecondarySchedulerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SecondarySchedulerAttribute.canInstantiate(obj))
        	return new SecondarySchedulerAttribute(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("326b1507-23ac-4288-a5b0-8304c45bc699")
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
        SecondarySchedulerAttribute other = (SecondarySchedulerAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("92f34956-3617-4830-8035-80c7f0ce0b55")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Attribute_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a9bfc633-d5ac-4545-aaf1-9cd338a13bb5")
    public List<String> getSecondaryScheduler_Attribute_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerAttribute.MdaTypes.SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("01c58d46-9b77-40ab-acc8-66bced0e75af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Attribute_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59bede86-a783-422b-8910-233a01248a88")
    public void setSecondaryScheduler_Attribute_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerAttribute.MdaTypes.SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("15245f2d-1e20-4f75-bddf-8f2d14ed12ac")
    protected SecondarySchedulerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("c6bd2b12-aeeb-4a63-978a-a9098c88d0a0")
    public static final class MdaTypes {
        @objid ("5cc320e3-089a-41a1-9605-a350e08f405a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("418ee958-ac80-4615-92b5-5328414b881d")
        public static TagType SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("c2c4ba5a-78ac-4357-8a74-d48850c3f9c7")
        private static Stereotype MDAASSOCDEP;

        @objid ("0ca80e37-53f0-4bba-9248-225b56f15e51")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c3061b23-ee4e-4cbb-aaf4-3e793ce7d137")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002f3c65-0ccf-11df-8525-001302895b2b");
            SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "80b1836f-16fa-11df-b92a-0014222a9f79");
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
