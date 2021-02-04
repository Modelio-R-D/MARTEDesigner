/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SharedDataComResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1aea26d1-6bc6-4915-a336-13e4039daf1c")
public class SharedDataComResourceLifeline extends SwCommunicationResourceLifeline {
    @objid ("fc9c69c6-bc82-42a1-83cc-e61a3ce394fb")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Lifeline";

    @objid ("06211603-b9c8-4e83-a4c9-5ab14392ee2f")
    public static final String SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE = "SharedDataComResource_Lifeline_readServices";

    @objid ("580a5252-67ed-4bd7-a09d-df2632850282")
    public static final String SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE = "SharedDataComResource_Lifeline_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9935ac27-f363-4723-af1a-3e501b0aaa05")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> then instantiate a {@link SharedDataComResourceLifeline} proxy.
     * 
     * @return a {@link SharedDataComResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("90c4e1cd-854e-4c47-aef6-a6239e61a060")
    public static SharedDataComResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLifeline.STEREOTYPE_NAME);
        return SharedDataComResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLifeline} proxy from a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SharedDataComResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("c969fe4a-8179-4bbd-801f-fef213fa17ef")
    public static SharedDataComResourceLifeline instantiate(final Lifeline obj) {
        return SharedDataComResourceLifeline.canInstantiate(obj) ? new SharedDataComResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLifeline} proxy from a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SharedDataComResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9ca94a78-38e4-4499-9bd4-f039ba7f0b02")
    public static SharedDataComResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SharedDataComResourceLifeline.canInstantiate(obj))
        	return new SharedDataComResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c572fbbb-2278-491b-a9e6-1c773e509047")
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
        SharedDataComResourceLifeline other = (SharedDataComResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("ce4a2f57-3463-48ee-8c60-86d9ed8f9aa2")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Lifeline_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c139b086-79cf-4ee4-af13-b97435e8d758")
    public List<String> getSharedDataComResource_Lifeline_readServices() {
        return this.elt.getTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Lifeline_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a6e985bf-9ff1-46cb-9e1c-a9e873047b51")
    public List<String> getSharedDataComResource_Lifeline_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("98f01bb7-72ab-413d-a1cc-0146f4bc4439")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Lifeline_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4cc2db86-e4c9-42b6-9dc4-47583237c8ac")
    public void setSharedDataComResource_Lifeline_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Lifeline_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21798bb0-11eb-4980-909f-573d9c6547a4")
    public void setSharedDataComResource_Lifeline_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("cc8d8d85-338d-40f6-a7de-4fb0413d4597")
    protected SharedDataComResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("2a274b08-7458-40e4-9e4f-0a6bffae7774")
    public static final class MdaTypes {
        @objid ("6ca8d0fa-06db-451e-b880-db160a2d25fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("51064a05-8183-4138-b26c-9bafc16c9242")
        public static TagType SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT;

        @objid ("e7364084-430e-4baa-9b7a-0a682ddccfc4")
        public static TagType SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("1a806818-c3a2-4316-9b9c-f8c3a309b675")
        private static Stereotype MDAASSOCDEP;

        @objid ("2dcb0834-8ac1-42a5-9ec6-df31969a8836")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e277173-4a60-44c2-aa3e-08c8c9aa3dd7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2da741a4-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2da741a5-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2da741a6-10d8-11df-81d9-0014222a9f79");
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
